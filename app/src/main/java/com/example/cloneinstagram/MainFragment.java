package com.example.cloneinstagram;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;

import com.example.cloneinstagram.databinding.FragmentMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {
    private FragmentMainBinding binding;
    private StoriesAdapter adapter;
    private NavController controller;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBinding.inflate(inflater);
        initStoriesRecycler();
        return binding.getRoot();
    }

    private void initStoriesRecycler() {
        List<Integer> listImages = new ArrayList<>();


        List<StoriesUserModel> list = new ArrayList<>();
        list.add(new StoriesUserModel(true));
        list.add(new StoriesUserModel("UserName",R.drawable.img_post,listImages,false));
        list.add(new StoriesUserModel("USerName",R.drawable.img_post,listImages,false));
        list.add(new StoriesUserModel("USerName",R.drawable.img_post,listImages,false));
        list.add(new StoriesUserModel("USerName",R.drawable.img_post,listImages,false));
        list.add(new StoriesUserModel("USerName",R.drawable.img_post,listImages,false));
        list.add(new StoriesUserModel("USerName",R.drawable.img_post,listImages,false));

            adapter = new StoriesAdapter(list);
            binding.rvStories.setAdapter(adapter);
        }
}
