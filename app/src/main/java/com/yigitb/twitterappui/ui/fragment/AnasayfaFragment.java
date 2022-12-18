package com.yigitb.twitterappui.ui.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yigitb.twitterappui.R;
import com.yigitb.twitterappui.data.entity.Tweetler;
import com.yigitb.twitterappui.databinding.FragmentAnasayfaBinding;
import com.yigitb.twitterappui.ui.adapter.TweetlerAdapter;

import java.util.ArrayList;
import java.util.List;


public class AnasayfaFragment extends Fragment {

    private FragmentAnasayfaBinding binding;

    private List<Tweetler> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        list.add(new Tweetler("Foto ad","Ali","ali","foto paylastim","11.21"));
        list.add(new Tweetler("Foto ad","Veli","veli","test 123","08.36"));
        list.add(new Tweetler("Foto ad","Hasan","hasan","deneme 12","13.44"));
        list.add(new Tweetler("Foto ad","Ayse","ayse","xdxdxdxdxd","16.11"));

        TweetlerAdapter tweetlerAdapter = new TweetlerAdapter(getContext(),list);

        binding.recyclerView.setAdapter(tweetlerAdapter);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}