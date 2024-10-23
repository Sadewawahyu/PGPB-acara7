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

import com.example.bottomlayout.databinding.FragmentHomeBinding;
import com.example.bottomlayout.homeFragmentDirections;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private com.example.bottomlayout.homeFragmentDirections HomeFragmentDirections;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Define the navigation action
        NavDirections action = HomeFragmentDirections.actionHomeFragmentToDestinationFragment();

        // Set the click listener for the button
        binding.btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(HomeFragment.this).navigate(action);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
