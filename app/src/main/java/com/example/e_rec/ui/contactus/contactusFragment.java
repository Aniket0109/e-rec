package com.example.e_rec.ui.contactus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.e_rec.R;


public class contactusFragment extends Fragment {

    private contactusViewModel shareViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater ,
                             ViewGroup container , Bundle savedInstanceState) {
        shareViewModel =
                ViewModelProviders.of(this).get(contactusViewModel.class);
        View root = inflater.inflate(R.layout.contactus , container , false);

        return root;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
    }

}