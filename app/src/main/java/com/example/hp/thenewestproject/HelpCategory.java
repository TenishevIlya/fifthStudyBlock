package com.example.hp.thenewestproject;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import butterknife.BindBitmap;
import butterknife.BindView;
import butterknife.ButterKnife;

public class HelpCategory extends AppCompatActivity {

    private static final int elemCount = 2;

    @BindBitmap(R.mipmap.face_kids)
    Bitmap kids;

    @BindBitmap(R.mipmap.face_adults)
    Bitmap adults;

    @BindBitmap(R.mipmap.face_old)
    Bitmap olds;

    @BindBitmap(R.mipmap.face_animals)
    Bitmap animals;

    @BindBitmap(R.mipmap.icon_event)
    Bitmap events;

    @BindView(R.id.recycler)
    RecyclerView showRecycler;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.help_screen);
        RecyclerView rv;
        GridLayoutManager glm;


        ButterKnife.bind(this);
        Bitmap imgs[] = {kids, adults, olds, animals, events};

        String imgNames[] = getResources().getStringArray(R.array.imageTitles);

        ButterKnife.bind(this);

        getSupportActionBar().setTitle(R.string.actionBarTitle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rv = showRecycler;
        glm = new GridLayoutManager(HelpCategory.this, elemCount);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(glm);
        MyAdapter adapter = new MyAdapter(imgs, imgNames);
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
