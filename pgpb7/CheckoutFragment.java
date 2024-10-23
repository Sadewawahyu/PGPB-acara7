package com.example.pgpb7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.navigation.fragment.NavHostFragment;

import com.example.bottomlayout.R;
import com.example.bottomlayout.databinding.FragmentCheckoutBinding;

public class CheckoutFragment extends Fragment {
    private FragmentCheckoutBinding binding;
    private Spinner spinner;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentCheckoutBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        spinner = binding.spinnerOptions;

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(requireContext(), R.array.spinner_items, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Mendapatkan nilai yang dipilih dari spinner
                String selectedValue = spinner.getSelectedItem().toString();

                // Mengirim hasil ke ChooseFragment melalui Fragment Result
                Bundle result = new Bundle();
                result.putString("selectedValue", selectedValue);
                getParentFragmentManager().setFragmentResult("selectedValue", result);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // Handle ketika tidak ada item yang dipilih
            }
        });

        binding.btnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(CheckoutFragment.this).navigateUp();
            }
        });
    }
}
