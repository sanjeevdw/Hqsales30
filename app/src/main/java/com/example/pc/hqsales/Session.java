package com.example.pc.hqsales;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class

Session {

    private SharedPreferences prefs;

        public Session(Context context) {

            prefs = PreferenceManager.getDefaultSharedPreferences(context);

        }

        public void setusertoken(String userToken) {

            prefs.edit().putString("userToken", userToken).commit();
        }

        public String getusertoken() {

            String userToken = prefs.getString("userToken", "");
            return userToken;
            }
}
