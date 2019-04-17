package com.example.hp.thenewestproject;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.List;

import butterknife.BindArray;
import butterknife.BindBitmap;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HelpCategory extends AppCompatActivity {

    private static final int elemCount = 2;

    @BindView(R.id.recycler)
    RecyclerView showRecycler;

    @BindString(R.string.actionBarTitle)
    String barTitle;

    @BindArray(R.array.imageTitles)
    String[] imgTitles;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);
        ButterKnife.bind(this);


        getSupportActionBar().setTitle(barTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        GridLayoutManager glm = new GridLayoutManager(HelpCategory.this, elemCount);
        showRecycler.setHasFixedSize(true);
        showRecycler.setLayoutManager(glm);
        MyAdapter adapter = new MyAdapter(imgTitles);
        showRecycler.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void onMenuItemClick(MenuItem item) {
        Intent i = new Intent(HelpCategory.this, Profile.class);
        startActivity(i);
    }
}
