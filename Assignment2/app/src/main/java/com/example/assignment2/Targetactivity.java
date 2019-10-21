package com.example.assignment2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Targetactivity extends AppCompatActivity {

    TextView mTitle1, mDescribtion1;
    ImageView mImage1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_targetactivity);

        ActionBar actionBar= getSupportActionBar();


        mTitle1=findViewById(R.id.title);
        mDescribtion1=findViewById(R.id.description);
        mImage1=findViewById(R.id.imageview);

        Intent intent=getIntent();
        String mTitle=intent.getStringExtra("iTitle");
        String mDescription =intent.getStringExtra("iDesc");

        byte[] mBytes=getIntent().getByteArrayExtra("iImage");

        Bitmap bitmap= BitmapFactory.decodeByteArray(mBytes,0,mBytes.length);

        actionBar.setTitle(mTitle);

        mTitle1.setText(mTitle);
        mDescribtion1.setText(mDescription);
        mImage1.setImageBitmap(bitmap);


    }
    public void addNumber(View view){
        t1 = (TextView)findViewById(R.id.number);
        int number1 = Integer.parseInt(t1.getText().toString());
        number1 = number1 + 1;
        t1.setText(String.valueOf(number1));
    }

    public void minus(View view){
        t1 = (TextView)findViewById(R.id.number);
        int number1 = Integer.parseInt(t1.getText().toString());
        if(number1<=0){
            t1.setText(String.valueOf(0));
        }else{
            number1 = number1-1;
        }
        t1.setText(String.valueOf(number1));
    }

    public void btnAdd(View view){
        t1 = (TextView)findViewById(R.id.number);
        mTitle1 = (TextView)findViewById(R.id.title);
        String[] array = new String[2];
        array[0] = mTitle1.getText().toString();
        array[1] = t1.getText().toString();
        MainActivity.al.add(array);
    }
}
