package com.realinet.fanpagemanager.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.realinet.fanpagemanager.ErrorActivity;
import com.realinet.fanpagemanager.R;

public class Taikhoan_Fragment extends Fragment {
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_taikhoan_, container, false);
        view.setOnClickListener(view1 -> {
            startActivity(new Intent(requireActivity(),ErrorActivity.class));
        });
        return view;
    }
    public void onButtonClick(View view){

        startActivity(new Intent(requireActivity(),ErrorActivity.class));
    }
}