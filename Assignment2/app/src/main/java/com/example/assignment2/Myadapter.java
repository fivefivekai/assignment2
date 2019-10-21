package com.example.assignment2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
public class Myadapter extends RecyclerView.Adapter<Myholder> {
        Context c;
        ArrayList<Model> models;

public Myadapter(Context c, ArrayList<Model> models){
        this.c=c;

        this.models=models;
}
@NonNull
@Override
public Myholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customer, null);

        return new Myholder(view);
        }

@Override
public void onBindViewHolder(@NonNull final Myholder holder, int position) {
        holder.mtitle.setText(models.get(position).getTitle());
        holder.mdescrip.setText(models.get(position).getDescription());
        holder.miiew.setImageResource(models.get(position).getImg());

        holder.setItemclickListener(new ItemclickListener() {
                @Override
                public void onItemclickListener(View v, int position) {
                        String gTitle=models.get(position).getTitle();
                        String gDesc=models.get(position).getDescription();
                        BitmapDrawable bitmapDrawable=(BitmapDrawable)holder.miiew.getDrawable();

                        Bitmap bitmap=bitmapDrawable.getBitmap();

                        ByteArrayOutputStream stream= new ByteArrayOutputStream();

                        bitmap.compress(Bitmap.CompressFormat.PNG,100, stream);

                        byte[] bytes=stream.toByteArray();

                        Intent intent=new Intent(c, Targetactivity.class);
                        intent.putExtra("iTitle",gTitle);
                        intent.putExtra("iDesc",gDesc);
                        intent.putExtra("iImage",bytes);
                        c.startActivity(intent);


                }
        });


        }

@Override
public int getItemCount() {
        return models.size();
        }
        }
