package com.example.recyclerviewwithnav

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.recyclerviewwithnav.`interface`.CellClickListener
import com.example.recyclerviewwithnav.adapter.ItemAdapter
import com.example.recyclerviewwithnav.data.Datasource
import com.example.recyclerviewwithnav.databinding.FragmentOneBinding

class FragmentOne : Fragment(), CellClickListener
{
   override fun onCreateView(
       inflater: LayoutInflater,
       container: ViewGroup?,
       savedInstanceState: Bundle?): View {

       val binding: FragmentOneBinding = FragmentOneBinding.inflate(inflater, container, false)

       val myView: View = binding.root
       //val myView: View = inflater.inflate(R.layout.fragment_one, container, false)
        // Inflate the layout for this fragment

       val myDataset = Datasource().loadListItemModels()
       val recyclerView = binding.recyclerView
       recyclerView.adapter = ItemAdapter(requireContext(), myDataset, this)

       return myView
    }
    //override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
    //    super.onViewCreated(itemView, savedInstanceState)
//
    //    val myDataset = Datasource().loadListItemModels()
    //    val recyclerView = requireView().findViewById<RecyclerView>(R.id.recycler_view)
    //    recyclerView.adapter = ItemAdapter(requireContext(), myDataset, this)
    //}

    override fun onCellClickListener(id: Int) {
        findNavController().navigate(id)
    }
}