package com.itis.foody.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.itis.foody.R
import com.itis.foody.databinding.DialogFragmentRecipeInfoBinding

class RecipeInfoDialogFragment : BottomSheetDialogFragment() {

    private lateinit var binding: DialogFragmentRecipeInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.dialog_fragment_recipe_info, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = DialogFragmentRecipeInfoBinding.bind(view)
    }
}