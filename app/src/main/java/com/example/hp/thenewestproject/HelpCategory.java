package com.example.hp.thenewestproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;

public class HelpCategory extends AppCompatActivity {

    RecyclerView rv;
    GridLayoutManager glm;

    private String imgNames[] = {
        "Дети", "Взрослые", "Пожилые", "Животные", "Мероприятия"
    };

    private int imgs[] = {
         R.mipmap.face_kids, R.mipmap.face_adults, R.mipmap.face_old,
            R.mipmap.face_animals, R.mipmap.icon_event
    };


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view);

        getSupportActionBar().setTitle("Помочь");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        rv = findViewById(R.id.recycler);
        glm = new GridLayoutManager(HelpCategory.this, 2);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(glm);
        MyAdapter adapter = new MyAdapter(HelpCategory.this,imgs,imgNames);
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
