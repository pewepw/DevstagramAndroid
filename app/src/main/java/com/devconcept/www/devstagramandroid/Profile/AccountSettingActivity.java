package com.devconcept.www.devstagramandroid.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.devconcept.www.devstagramandroid.R;

/**
 * Created by harry on 16/02/2018.
 */

public class AccountSettingActivity extends AppCompatActivity {
    private static final String TAG = "AccountSettingActivity";
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountsetting);
        Log.d(TAG, "onCreate: started");
    }
}
