package com.example.newsappdatadummy.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsappdatadummy.DataNews
import com.example.newsappdatadummy.NewsAdapter
import com.example.newsappdatadummy.R
import com.example.newsappdatadummy.bindingNewsHeadline
import com.example.newsappdatadummy.databinding.FragmentAllNewsBinding


class AllNewsFragment : Fragment() {

    private lateinit var binding : FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllNewsBinding.inflate(inflater,container,false)
        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }

        bindingNewsHeadline(binding.newsHeadlne, 0)

        return binding.root
    }

}