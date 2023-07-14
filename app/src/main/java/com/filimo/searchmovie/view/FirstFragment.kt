package com.filimo.searchmovie.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.filimo.data.dataModel.SearchMovie
import com.filimo.searchmovie.R
import com.filimo.searchmovie.databinding.FragmentFirstBinding
import com.filimo.searchmovie.view.adapter.SearchMovieAdapter
import com.filimo.searchmovie.viewmodel.SearchMovieViewModel
import dagger.hilt.android.AndroidEntryPoint


/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
@AndroidEntryPoint
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val mViewModel: SearchMovieViewModel by activityViewModels()
    private val binding get() = _binding!!
    private lateinit var mAdapter: SearchMovieAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searchViewTextChangeHandler()

        initRecyclerView()

        /*Handle set item result to adapter and recyclerView*/
        mViewModel.searchMovieResultLiveData.observe(viewLifecycleOwner, Observer {
            it?.let {
                binding.recyclerview.apply {
                    mAdapter.setItems(it)
                    binding.recyclerview.adapter = mAdapter
                }
            }
        })

    }

    fun searchViewTextChangeHandler(){

        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                if (newText.isNullOrEmpty()) {
                    mAdapter.clearData()
                    binding.searchView.clearFocus()
                    binding.recyclerview.visibility = View.GONE
                } else {
                    binding.recyclerview.visibility = View.VISIBLE
                    mViewModel.callGetSearchMovieResultRequest(newText)
                }
                return false
            }
        })

    }

    fun initRecyclerView() {
        mAdapter = SearchMovieAdapter(requireContext())
        binding.recyclerview.layoutManager = LinearLayoutManager(context)
        binding.recyclerview.setHasFixedSize(true)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}