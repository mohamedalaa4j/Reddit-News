package com.grand.redditnews.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.grand.redditnews.R
import com.grand.redditnews.databinding.FragmentArticleBinding

class ArticleFragment : Fragment(R.layout.fragment_article) {
    private var binding: FragmentArticleBinding? = null

    private val args: ArticleFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentArticleBinding.bind(view)

        binding?.ivBack?.setOnClickListener { activity?.onBackPressed() }

        assignArticleViews()
    }//onViewCreated////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

    private fun assignArticleViews (){
        binding?.tvTitle?.text = args.title
        binding?.tvBody?.text = args.body

        if (args.thumbnail.isNotEmpty()){
            Glide.with(requireContext()).load(args.thumbnail).into(binding?.iv!!)
        }else{
            binding?.iv?.visibility = View.GONE
        }
    }
}