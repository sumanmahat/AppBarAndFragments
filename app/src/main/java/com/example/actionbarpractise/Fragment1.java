package com.example.actionbarpractise;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class Fragment1 extends Fragment {

    private Fragment1ViewModel mViewModel;
    private Button btnTest;

    public static Fragment1 newInstance() {
        return new Fragment1();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1_fragment,container,false);
        btnTest = view.findViewById(R.id.btnTest);

        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Testing Button click 1", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }


}
