package com.example.assignment2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class orderAdapter extends RecyclerView.Adapter<orderAdapter.userViewholer> {

    private ArrayList<String[]> al;

    public orderAdapter(ArrayList<String[]> al){
        this.al = al;
    }

    @NonNull
    @Override
    public userViewholer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.orderlist,parent,false);
        userViewholer user = new userViewholer(view);
        return user;
    }

    @Override
    public void onBindViewHolder(@NonNull userViewholer holder, int position) {
        String[] array = al.get(position);
        String title = array[0];
        int quantity = Integer.parseInt(array[1]);

        double price = 0;
        int image = 0;
        for(int i = 0; i < MainActivity.models.size(); i++){
            if(MainActivity.models.get(i).getTitle().equals(title)){
                String description = MainActivity.models.get(i).getDescription();
                price = Double.parseDouble(description.substring(1, 5));
                image = MainActivity.models.get(i).getImg();
                break;
            }
        }

        holder.img.setImageResource(image);
        holder.name.setText(title);
        holder.number.setText(String.valueOf(quantity));
    }

    @Override
    public int getItemCount() {
        return al.size();
    }
    public static class userViewholer extends RecyclerView.ViewHolder{

        public ImageView img;
        public TextView name;
        public TextView number;


        public userViewholer(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.imageView2);
            name=itemView.findViewById(R.id.name1);
            number=itemView.findViewById(R.id.number1);
        }
    }
}
