package com.example.hp.thenewestproject;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>{

    private Context context;
    private int images[];
    private String names[];


    public MyAdapter(Context context, int[] images, String[] names) {
        this.context = context;
        this.images = images;
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

        viewHolder.img.setImageResource(images[i]);
        viewHolder.txt.setText(names[i]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    public static class MyHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView txt;

        @BindView(R.id.imageView1)
        ImageView image;

        @BindView(R.id.textView1)
        TextView text;


        public MyHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            img = image;
            txt = text;
        }
    }
}
