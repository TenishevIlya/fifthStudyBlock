package com.example.hp.thenewestproject;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Arrays;

import butterknife.BindArray;
import butterknife.BindBitmap;
import butterknife.BindDrawable;
import butterknife.BindInt;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HelpCategory extends AppCompatActivity {

    @BindBitmap(R.mipmap.face_kids)
    Bitmap kids;


    private int imgs[] = {R.mipmap.face_kids, R.mipmap.face_adults, R.mipmap.face_old,
            R.mipmap.face_animals, R.mipmap.icon_event
    };



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);
        RecyclerView rv;
        GridLayoutManager glm;

        String imgNames[] = getResources().getStringArray(R.array.imageTitles);

        getSupportActionBar().setTitle(R.string.actionBarTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rv = findViewById(R.id.recycler);
        glm = new GridLayoutManager(HelpCategory.this, 2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(glm);
        MyAdapter adapter = new MyAdapter(HelpCategory.this, imgs, imgNames);
        rv.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
