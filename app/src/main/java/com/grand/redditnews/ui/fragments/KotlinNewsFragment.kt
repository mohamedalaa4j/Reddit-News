package com.grand.redditnews.ui.fragments

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
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

        viewModel.getKotlinNews()

        lifecycleScope.launchWhenStarted {
            viewModel.kotlinNewsStateFlow.collect {
                parseKotlinNewsStateFlow(it)
            }
        }

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
                }
                Utilities.cancelProgressDialog()
            }


            is ScreenState.Error -> {
                Toast.makeText(context, screenState.message, Toast.LENGTH_SHORT).show()
                Log.e("error", screenState.message.toString())
                Utilities.cancelProgressDialog()
            }
        }
    }

    private fun setupKotlinNewsRV(data: List<KotlinNewsModel.Data.Children?>) {
        binding?.rvNews?.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        // adapter
        val adapter = RvAdapterKotlinNews(data){}
        binding?.rvNews?.adapter = adapter


    }


}