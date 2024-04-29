package com.example.navigation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.navigation.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RootFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RootFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "Cringe";

    // TODO: Rename and change types of parameters
    private String mParam1;

    public RootFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_root, container, false);

        EditText e = view.findViewById(R.id.editText);
        e.setText(mParam1);
        return view;
    }
}