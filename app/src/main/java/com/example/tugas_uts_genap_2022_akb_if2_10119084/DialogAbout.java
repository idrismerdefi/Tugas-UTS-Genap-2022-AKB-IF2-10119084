package com.example.tugas_uts_genap_2022_akb_if2_10119084;

/*
 * NIM : 10119084
 *Nama : Muhammad Idris Merdefi
 *Kelas : IF2
 *Email : muhammadidrismerdefi23@gmail.com
 * */

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import androidx.fragment.app.DialogFragment;

public class DialogAbout extends DialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.about,container,false);
    }
}
