package com.example.assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Myadapter myadpter;
    public static ArrayList<Model> models = new ArrayList<>();
    public static ArrayList<String[]> al = new ArrayList<>();

    private Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        myadpter = new Myadapter(this, getMyList());
        recyclerView.setAdapter(myadpter);

    }

    public void openOrder(View v){
        Intent intent = new Intent(this, Order.class);
        startActivity(intent);
    }

    private ArrayList<Model> getMyList(){

        Model m= new Model();

        m.setTitle("Regular Chips");
        m.setDescription("$5.00"+"\n"+"French fries are served hot, either soft or crispy");
        m.setImg(R.drawable.fries);
        models.add(m);
        m= new Model();


        m.setTitle("Chicken wings");
        m.setDescription("$8.00"+"\n"+"Crispy Fried chicken wings, delicious!");
        m.setImg(R.drawable.wings);
        models.add(m);
        m= new Model();

        m.setTitle("Coca-Cola");
        m.setDescription("$3.00"+"\n"+"soft drink with 375ml can");
        m.setImg(R.drawable.coke);
        models.add(m);
        m= new Model();

        m.setTitle("Chicken Legs");
        m.setDescription("$7.50"+"\n"+"Crispy Fried chicken legs with 550 calories");
        m.setImg(R.drawable.legs);
        models.add(m);
        m= new Model();

        m.setTitle("Chicken Nuggets");
        m.setDescription("$6.00"+"\n"+"Made with white meat, our bite-sized Chicken Nuggets are tender and juicy on the inside and crispy on the outside. Coated in a homestyle seasoned breading.");
        m.setImg(R.drawable.nuggets);
        models.add(m);



        m= new Model();
        m.setTitle("Orange juice");
        m.setDescription("$4.55" +"\n"+"Orange Juice explodes with flavor and is a good source of Vitamin C");
        m.setImg(R.drawable.orange);
        models.add(m);


        m= new Model();
        m.setTitle("Chicken Curry");
        m.setDescription("$10.00"+"\n"+"Pure curry flavor accompanied by juicy chicken");
        m.setImg(R.drawable.curry);
        models.add(m);

        m= new Model();
        m.setTitle("Milk tea");
        m.setDescription("$4.00"+"\n"+"Brewed fresh daily, our Milk Tea pairs seamlessly with many menu favorites.");
        m.setImg(R.drawable.milktea);
        models.add(m);

        m= new Model();
        m.setTitle("Cakes");
        m.setDescription("$8.00"+"\n"+"Sweet, soft and juicy");
        m.setImg(R.drawable.cake);
        models.add(m);

        m= new Model();
        m.setTitle("Sushi");
        m.setDescription("$7.5"+"\n"+"Love, exquisite sushi!");
        m.setImg(R.drawable.sushi);
        models.add(m);

        m= new Model();
        m.setTitle("Coffee");
        m.setDescription("$5.00"+"\n"+"Americano with 20 calories");
        m.setImg(R.drawable.coffee);
        models.add(m);

        m= new Model();
        m.setTitle("Hamburgers");
        m.setDescription("$6.00"+"\n"+"It contains real Australian beef, lettuce and tomato");
        m.setImg(R.drawable.hamburger);
        models.add(m);

        m= new Model();
        m.setTitle("Ice Cream");
        m.setDescription("$3.00"+"\n"+"We didn’t invent soft serve, but with one taste of our cool, creamy, and velvety Vanilla Soft Serve, you’ll think we perfected it. Your choice of classic cone or cup.");
        m.setImg(R.drawable.icecream);
        models.add(m);

        m= new Model();
        m.setTitle("Pizza");
        m.setDescription("$11.00"+"\n"+"Smoky honey ham, pepperoni, Italian sausage");
        m.setImg(R.drawable.pizza);
        models.add(m);

        m= new Model();
        m.setTitle("Spring water");
        m.setDescription("$2.00"+"\n"+"Exclusive pure water, refreshing your everything");
        m.setImg(R.drawable.water);
        models.add(m);


        return models;
}
}