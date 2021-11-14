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
import com.example.newsappdatadummy.databinding.FragmentTopBinding


class TopFragment : Fragment() {

    private lateinit var binding : FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater,container, false)
        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }

        bindingNewsHeadline(binding.newsHeadlne,2)
        return binding.root
    }

}