package com.grand.redditnews.ui.fragments

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.grand.redditnews.R
import com.grand.redditnews.adapters.RvAdapterKotlinNews
import com.grand.redditnews.data.models.received.KotlinNewsModel
import com.grand.redditnews.databinding.FragmentKotlinNewsBinding
import com.grand.redditnews.utilities.ScreenState
import com.grand.redditnews.utilities.Utilities
import com.grand.redditnews.viewModel.KotlinNewsFragmentVM
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KotlinNewsFragment : Fragment(R.layout.fragment_kotlin_news) {
    private var binding: FragmentKotlinNewsBinding? = null

    private val viewModel: KotlinNewsFragmentVM by lazy {
        ViewModelProvider(this)[KotlinNewsFragmentVM::class.java]
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentKotlinNewsBinding.bind(view)

        retrieveCachedData(requireContext())

        if (Utilities.isConnected(requireContext())) {
            viewModel.getKotlinNews()
        } else {
            Toast.makeText(context, getString(R.string.no_internet_connection), Toast.LENGTH_SHORT).show()
        }

        binding?.ivRefresh?.setOnClickListener {
            if (Utilities.isConnected(requireContext())) {
                viewModel.getKotlinNews()
            } else {
                Toast.makeText(context, getString(R.string.no_internet_connection), Toast.LENGTH_SHORT).show()
            }
        }

        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.kotlinNewsStateFlow.collect {
                parseKotlinNewsStateFlow(it)
            }
        }

        //override onBackPressed
        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Utilities.doubleTapToExit(activity!!)
            }
        })

    }//onViewCreated////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun parseKotlinNewsStateFlow(screenState: ScreenState<KotlinNewsModel>) {

        when (screenState) {

            is ScreenState.InitialValue -> {
            }

            is ScreenState.Loading -> {
                Utilities.showProgressDialog(requireContext())
            }

            is ScreenState.Success -> {
                if (screenState.data != null) {
                    val response = screenState.data.data?.children!!

                    setupKotlinNewsRV(response)

                    //viewModel.storeObjectInSharedPref(screenState.data.data, "responseCache")
                    viewModel.cacheTheResponseData(screenState.data, requireContext())

                    Utilities.cancelProgressDialog()
                }
            }

            is ScreenState.Error -> {
                Toast.makeText(context, screenState.message, Toast.LENGTH_SHORT).show()
                Utilities.cancelProgressDialog()
            }
        }
    }

    private fun setupKotlinNewsRV(data: List<KotlinNewsModel.Data.Children?>) {
        binding?.rvNews?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        // adapter
        val adapter = RvAdapterKotlinNews(data) { title, body, thumbnail ->
            viewModel.navigateToArticleView(requireView(), title, body, thumbnail)
        }
        binding?.rvNews?.adapter = adapter
    }

    private fun retrieveCachedData(context: Context) {
        if (viewModel.retrieveCachedData(context) != null) {
            setupKotlinNewsRV(viewModel.retrieveCachedData(requireContext())?.data?.children!!)
        }
    }

}
