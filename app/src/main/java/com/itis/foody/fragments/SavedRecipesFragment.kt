package com.itis.foody.fragments

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.fragment.app.Fragment
import com.itis.foody.R
import com.itis.foody.databinding.FragmentSavedRecipesBinding
import com.itis.foody.extensions.navigateBack
import com.itis.foody.extensions.setBackButton

class SavedRecipesFragment : Fragment(R.layout.fragment_saved_recipes) {

    private lateinit var binding: FragmentSavedRecipesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSavedRecipesBinding.bind(view)

        setActionBarAttrs()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean = when (item.itemId) {
        android.R.id.home -> {
            navigateBack()
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

    private fun setActionBarAttrs() {
        setBackButton()
//        setTitle()
    }
}
