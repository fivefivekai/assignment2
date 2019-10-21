package com.example.assignment2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class Order extends AppCompatActivity{

        RecyclerView recyclerView;
        orderAdapter myadpter;

        private TextView total;
        private double totalAmount = 0;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        recyclerView=findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myadpter = new orderAdapter(MainActivity.al);
        recyclerView.setAdapter(myadpter);

        total = findViewById(R.id.total);

        for(int i = 0; i < MainActivity.al.size(); i++) {
            String[] array = MainActivity.al.get(i);
            String title = array[0];
            int quantity = Integer.parseInt(array[1]);

            double price = 0;
            for (int j = 0; j < MainActivity.models.size(); j++) {
                if (MainActivity.models.get(j).getTitle().equals(title)) {
                    String description = MainActivity.models.get(j).getDescription();
                    price = Double.parseDouble(description.substring(1, 5));
                    break;
                }
            }

            totalAmount = totalAmount + (price * quantity);

        }

        total.setText("$" + String.valueOf(totalAmount));


    }
}
