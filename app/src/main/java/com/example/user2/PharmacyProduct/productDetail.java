package com.example.user2.PharmacyProduct;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.example.user2.PharmacyProduct.ViewHolder.ProductViewHolder;
import com.example.user2.PharmacyProduct.Model.Products;
import com.example.user2.fruitsvegetables.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

//FruitDetials;

public class productDetail extends AppCompatActivity {



    TextView product_name, product_price, product_description;

   public ImageView fruits_image;

    CollapsingToolbarLayout collapsingToolbarLayout;

    FloatingActionButton btnCart;

    ElegantNumberButton numberButton;

    FirebaseDatabase database;

    DatabaseReference products;

    Products currentproducts;



    String productsId = "";

    FirebaseRecyclerAdapter<Products, ProductViewHolder> adapter;




    TextView products_description,products_name,products_price;
    ImageView fruit_image;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_details);


        String prodId = getIntent().getStringExtra("pid");

        numberButton = (ElegantNumberButton) findViewById (R.id.number_button);
        btnCart = (FloatingActionButton) findViewById (R.id.btnCart);
        product_description = (TextView) findViewById (R.id.product_description);
        product_name = (TextView) findViewById (R.id.product_name);
        product_price = (TextView) findViewById (R.id.product_price);
        fruit_image = (ImageView) findViewById (R.id.img_friut);




        getProDetails (prodId);
    }

        private void getProDetails(String prodId){
            DatabaseReference prodRef=FirebaseDatabase.getInstance ().getReference ().child ("Products");
            prodRef.child (prodId).addValueEventListener (new ValueEventListener () {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.exists ()){
                        Products products=dataSnapshot.getValue (Products.class);

                        product_name.setText (products.getPname ());
                        product_price.setText (products.getPrice ());
                        product_description.setText (products.getDescription ());
                        Picasso.get ().load (products.getImage ()).into(fruit_image);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });




        btnCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Adding....", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        }






}

