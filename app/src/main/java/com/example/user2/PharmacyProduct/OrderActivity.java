package com.example.user2.PharmacyProduct;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.user2.fruitsvegetables.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import io.paperdb.Paper;

public class OrderActivity extends AppCompatActivity {

    private DatabaseReference ProductsRef;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);




        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Order");
        setSupportActionBar(toolbar);


        ProductsRef = FirebaseDatabase.getInstance().getReference().child("Order");


        Paper.init(this);
    }
}
