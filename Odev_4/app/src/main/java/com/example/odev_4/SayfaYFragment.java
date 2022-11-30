package com.example.odev_4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.odev_4.databinding.FragmentSayfaYBinding;


public class SayfaYFragment extends Fragment {

private FragmentSayfaYBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentSayfaYBinding .inflate(inflater, container, false);
        binding.buttonAnasayfa.setOnClickListener(view -> {


            Navigation.findNavController(view).navigate(R.id.anasayfaFragment);
        });

        return binding.getRoot();
    }
}