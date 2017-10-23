package com.example.juanma.androidpreferences;

/**
 * Created by Juanma on 20/10/2017.
 */

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Preferencia extends PreferenceActivity
{
    @SuppressWarnings("deprecation")

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.mai_preferens);
    }
}
