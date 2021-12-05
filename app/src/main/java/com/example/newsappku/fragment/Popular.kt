package com.example.newsappku.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsappku.data.DataNews
import com.example.newsappku.adapter.NewsAdapter
import com.example.newsappku.bindNewsHeadLine
import com.example.newsappku.databinding.FragmentPopularBinding


class Popular : Fragment() {

    private lateinit var binding : FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater,container,false)
        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }

        bindNewsHeadLine(binding.newsHeadline,1)

        return binding.root
    }

}