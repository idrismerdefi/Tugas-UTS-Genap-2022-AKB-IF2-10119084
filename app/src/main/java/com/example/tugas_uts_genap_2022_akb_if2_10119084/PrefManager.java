package com.example.tugas_uts_genap_2022_akb_if2_10119084;

/*
 * NIM : 10119084
 *Nama : Muhammad Idris Merdefi
 *Kelas : IF2
 *Email : muhammadidrismerdefi23@gmail.com
 * */

import android.content.Context;
import android.content.SharedPreferences;

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "myself-app";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setlauchedFirstTime(boolean lauchedFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, lauchedFirstTime);
        editor.commit();
    }

    public boolean lauchedFirstTime() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }
}

