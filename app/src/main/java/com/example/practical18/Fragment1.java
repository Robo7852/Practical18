package com.example.practical18;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment1 extends Fragment {
    Button button;
    TextView textView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        button = view.findViewById(R.id.button1);
        textView = view.findViewById(R.id.textView);


        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
//                TextView textView = view.findViewById(R.id.textView);
////                textView.setText("Hello");
                textView.setTextColor(Color.parseColor("#000000"));

            }
        });
        return view;
    }



}