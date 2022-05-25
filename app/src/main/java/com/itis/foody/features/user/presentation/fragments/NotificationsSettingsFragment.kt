package com.itis.foody.features.user.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.preference.PreferenceFragmentCompat
import com.itis.foody.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NotificationsSettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.notifications_preferences, rootKey)
    }
}
