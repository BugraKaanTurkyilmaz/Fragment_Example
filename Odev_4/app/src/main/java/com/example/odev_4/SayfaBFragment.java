package com.example.odev_4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev_4.databinding.FragmentSayfaBBinding;


public class SayfaBFragment extends Fragment {
private FragmentSayfaBBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false);
       binding.buttonY.setOnClickListener(view -> {

           Navigation.findNavController(view).navigate(R.id.sayfaYFragment);


       });

        return binding.getRoot();
    }
}