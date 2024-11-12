package com.example.segmentedcontrolexperiment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import androidx.fragment.app.Fragment;

public class FirstFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button buttonFirst = view.findViewById(R.id.buttonFirst);
        buttonFirst.setOnClickListener(v ->
                Toast.makeText(getActivity(), "First Fragment Button Clicked", Toast.LENGTH_SHORT).show()
        );

        return view;
    }
}
