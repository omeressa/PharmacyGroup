package com.example.user2.PharmacyProduct;



import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.user2.fruitsvegetables.R;


public class AdminCategoryActivity extends AppCompatActivity {


    private ImageView product,product1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);


        product = (ImageView) findViewById(R.id.image1);
        product1 = (ImageView) findViewById(R.id.image2);


        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "product");
                startActivity(intent);
            }
        });


        product1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "product1");
                startActivity(intent);
            }
        });

    }
}