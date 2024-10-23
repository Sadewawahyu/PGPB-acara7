package com.example.pgpb7;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bottomlayout.databinding.FragmentDestinationBinding;
import com.example.pgpb7.Disaster;
import com.example.pgpb7.DisasterAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DestinationFragment #newInstance} factory method to
 * create an instance of this fragment.
 */
public class DestinationFragment extends Fragment {

    private FragmentDestinationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentDestinationBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        List<Disaster> disasterList = new ArrayList<>();
        Disaster yogyakarta = new Disaster("Yogyakarta", "First Class Ticket");
        Disaster jakarta = new Disaster("Jakarta", "First Class Ticket");
        Disaster palembang = new Disaster("Palembang", "First Class Ticket");
        Disaster manado = new Disaster("Manado", "First Class Ticket");
        Disaster bali = new Disaster("Bali", "Business Class Ticket");
        Disaster bandung = new Disaster("Bandung", "Business Class Ticket");
        Disaster bogor = new Disaster("Bogor", "Business Class Ticket");
        Disaster surabaya = new Disaster("Surabaya", "Business Class Ticket");
        Disaster semarang = new Disaster("Semarang", "Economy Class Ticket");
        Disaster solo = new Disaster("Solo", "Economy Class Ticket");
        Disaster jepara = new Disaster("Jepara", "Economy Class Ticket");
        Disaster tegal = new Disaster("Tegal", "Economy Class Ticket");

        disasterList.add(yogyakarta);
        disasterList.add(jakarta);
        disasterList.add(palembang);
        disasterList.add(manado);
        disasterList.add(bali);
        disasterList.add(bandung);
        disasterList.add(bogor);
        disasterList.add(surabaya);
        disasterList.add(semarang);
        disasterList.add(solo);
        disasterList.add(jepara);
        disasterList.add(tegal);

        DisasterAdapter adapterDisaster = new DisasterAdapter(disasterList);

        binding.rvDisaster.setAdapter(adapterDisaster);
        binding.rvDisaster.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}