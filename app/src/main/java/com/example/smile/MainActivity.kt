package com.example.smile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.smile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var practiseAdapter: PractiseAdapter
    lateinit var  recyclerViewPractise: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate the layout for this fragment

        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)
        recyclerViewPractise = binding.recyclerViewPractise


        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerViewPractise.layoutManager = layoutManager


        // Shuffle the list of image names
        val shuffledImageNames = ImageStore.imagesNamesMap.values.toList().shuffled()
        val shuffledImageResources = ImageStore.imagesNamesMap.keys.toList().shuffled()


        practiseAdapter = PractiseAdapter(shuffledImageResources.toMutableList(),
            shuffledImageNames.toMutableList(),binding.btnShuffle,recyclerViewPractise)
        practiseAdapter.initsetRecyclerView(recyclerViewPractise)
        binding.recyclerViewPractise.adapter = practiseAdapter


        binding.recyclerViewPractise.adapter = practiseAdapter




    }
}