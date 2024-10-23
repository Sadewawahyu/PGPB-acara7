package com.example.pgpb7;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bottomlayout.databinding.ItemDisasterBinding;

import java.util.List;

public class DisasterAdapter extends
        RecyclerView.Adapter<DisasterAdapter.ItemDisasterViewHolder> {

    private List<Disaster> disasterList;

    public DisasterAdapter(List<Disaster> list) {
        disasterList = list;
    }

    @NonNull
    @Override
    public ItemDisasterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemDisasterBinding binding =
                ItemDisasterBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ItemDisasterViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemDisasterViewHolder holder, int position) {
        holder.bind(disasterList.get(position));

    }

    @Override
    public int getItemCount() {
        return disasterList.size();
    }

    public class ItemDisasterViewHolder extends RecyclerView.ViewHolder {
        private ItemDisasterBinding binding;

        public ItemDisasterViewHolder(ItemDisasterBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Disaster data) {
            binding.txtDisasterName.setText(data.getDisasterName());
            binding.txtDisasterType.setText(data.getDisasterType());
        }
    }
}


