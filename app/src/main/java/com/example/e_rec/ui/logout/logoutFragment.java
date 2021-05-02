package com.example.e_rec.ui.logout;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.e_rec.MainActivity;
import com.example.e_rec.R;

public class logoutFragment extends Fragment {

    private logoutViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater ,
                             ViewGroup container , Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
            Intent intent = new Intent(getActivity(), MainActivity.class);
            getActivity().startActivity(intent);
        return rootView;
    }
}