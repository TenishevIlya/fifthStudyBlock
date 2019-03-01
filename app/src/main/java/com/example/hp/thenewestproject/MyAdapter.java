package com.example.hp.thenewestproject;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.BindArray;
import butterknife.BindBitmap;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{

    private String names[];

    public MyAdapter(String[] names) {
        this.names = names;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View layout = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_layout, viewGroup, false);
        MyHolder myHolder = new MyHolder(layout);

        return myHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull MyHolder viewHolder, int i) {
        viewHolder.binData(names, i);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public static class MyHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.imageView1)
        ImageView image;

        @BindView(R.id.textView1)
        TextView text;

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

        public void binData(String[] titlesArray,int i){
            ButterKnife.bind(this, itemView);
            Bitmap imgs[] = {kids, adults, olds, animals, events};
            image.setImageBitmap(imgs[i]);
            text.setText(titlesArray[i]);
        }



        public MyHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
