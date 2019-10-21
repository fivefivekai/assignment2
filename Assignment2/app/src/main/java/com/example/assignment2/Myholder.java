package com.example.assignment2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Myholder extends RecyclerView.ViewHolder implements View.OnClickListener{
    ImageView miiew;
    TextView mtitle,mdescrip;
    ItemclickListener itemclickListener;



    Myholder(@NonNull View itemView) {
        super(itemView);

        this.miiew=itemView.findViewById(R.id.imageIv);
        this.mtitle=itemView.findViewById(R.id.titleTV);
        this.mdescrip=itemView.findViewById(R.id.descriptionTv);

        itemView.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        this.itemclickListener.onItemclickListener(v,getLayoutPosition());

    }

    public void setItemclickListener(ItemclickListener ic){
         this.itemclickListener=ic;
    }
}
