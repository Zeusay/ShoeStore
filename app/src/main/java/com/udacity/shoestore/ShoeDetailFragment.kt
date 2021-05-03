package com.udacity.shoestore

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.udacity.shoestore.databinding.FragmentShoeDetailBinding
import com.udacity.shoestore.models.Shoe
import kotlinx.android.synthetic.main.fragment_shoe_detail.*
import timber.log.Timber

class ShoeDetailFragment : Fragment() {

    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_detail, container, false
        )
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.overflow_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(
            item,
            requireView().findNavController()
        )
                || super.onOptionsItemSelected(item)
    }

    @SuppressLint("TimberArgCount")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        save_fab.setOnClickListener {
            val newShoeName: String = shoeNameField.text.toString()
            val newShoeCompany: String = shoeCompanyField.text.toString()
            val newShoeDesc: String = shoeDescField.text.toString()
            val newShoeSize: Double = shoeSizeField.text.toString().toDouble()

            Timber.v("Shoe Info: $newShoeName, $newShoeCompany, $newShoeSize, $newShoeDesc")

            val shoeAdd : Shoe = Shoe(newShoeName, newShoeSize, newShoeCompany, newShoeDesc)
            viewModel.addShoe(shoeAdd)

            val action = ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment()
            findNavController().navigate(action)
        }
        return_fab.setOnClickListener {
            val action = ShoeDetailFragmentDirections.actionShoeDetailFragmentToShoeListFragment()
            findNavController().navigate(action)
        }
    }
}
