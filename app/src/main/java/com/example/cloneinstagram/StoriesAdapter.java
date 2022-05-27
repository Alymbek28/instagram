package com.example.cloneinstagram;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.cloneinstagram.databinding.ItemStoriesBinding;

import java.util.ArrayList;
import java.util.List;

public class StoriesAdapter extends RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder> {

    private List<StoriesUserModel> list = new ArrayList<>();

    private ItemStoriesBinding binding;

    public StoriesAdapter(List<StoriesUserModel> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public StoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemStoriesBinding.inflate(LayoutInflater.from(parent.getContext()));
            return new StoriesViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StoriesViewHolder holder, int position) {
        if (list.get(position).getUserImage() != 0) {
            Glide.with(binding.getRoot().getContext())
                    .load(list.get(position).getUserImage())
                    .circleCrop()
                    .into(binding.imgStory);
        }
        //binding = ItemStoriesBinding.inflate(LayoutInflater.from(parent.getContext()));
        binding.storyUsername.setText(list.get(position).getUserName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class StoriesViewHolder extends RecyclerView.ViewHolder {
        ItemStoriesBinding binding;

        public StoriesViewHolder(@NonNull ItemStoriesBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
