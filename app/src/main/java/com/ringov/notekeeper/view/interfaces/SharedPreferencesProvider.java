package com.ringov.notekeeper.view.interfaces;

import android.content.SharedPreferences;

/**
 * Created by Сергей on 04.02.2017.
 */

public interface SharedPreferencesProvider {
    SharedPreferences getSharedPreferences(String name);
}
