package com.example.pgpb7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomlayout.cartFragmentDirections;
import com.example.bottomlayout.databinding.FragmentCartBinding;
import com.example.bottomlayout.databinding.FragmentHomeBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the  factory method to
 * create an instance of this fragment.
 */
public class CartFragment extends Fragment {

    private FragmentCartBinding binding;
    private com.example.bottomlayout.cartFragmentDirections CartFragmentDirections;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCartBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        NavDirections action = CartFragmentDirections.actionCartFragmentToChooseFragment();


        binding.btnTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(CartFragment.this).
                        navigate(action);
            }
        });

    }

}