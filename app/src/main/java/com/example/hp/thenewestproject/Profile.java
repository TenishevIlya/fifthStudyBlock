package com.example.hp.thenewestproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_page);
        getSupportActionBar().hide();
    }

    public void show_dialog(View v){
        FotoDialog dialog = new FotoDialog();
        dialog.show(getSupportFragmentManager(), "custom");
    }
}
