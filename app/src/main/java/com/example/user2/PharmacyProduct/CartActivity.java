package com.example.user2.PharmacyProduct;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.user2.fruitsvegetables.R;

public class CartActivity extends AppCompatActivity {



    RecyclerView recyclerviewCart;

    static TextView cartPrice;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);

        setContentView (R.layout.activity_cart);


    }


}