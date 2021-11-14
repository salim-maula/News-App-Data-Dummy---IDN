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
import com.example.newsappdatadummy.databinding.FragmentPopularBinding

class PopularFragment : Fragment() {

    private lateinit var binding : FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater,container, false)
        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }

        bindingNewsHeadline(binding.newsHeadlne,1)

        return binding.root
    }

}