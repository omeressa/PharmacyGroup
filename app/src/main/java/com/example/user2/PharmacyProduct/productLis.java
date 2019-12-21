package com.example.user2.PharmacyProduct;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.user2.PharmacyProduct.Model.Products;
import com.example.user2.PharmacyProduct.ViewHolder.ProductViewHolder;
import com.example.user2.fruitsvegetables.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

//List;
public class productLis extends AppCompatActivity {



    FirebaseDatabase database;

    DatabaseReference productList;

    RecyclerView recyclerView;

    RecyclerView.LayoutManager layoutManager;



    String categoryId = "";

    FirebaseRecyclerAdapter<Products, ProductViewHolder> adapter;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.product_list);

        //Firebase

        database = FirebaseDatabase.getInstance();

        productList = database.getReference("Foods");



        recyclerView = (RecyclerView) findViewById(R.id.recycler_food);

        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);



        //Get Intent here

        if(getIntent() != null)

            categoryId = getIntent().getStringExtra("CategoryId");

        if(!categoryId.isEmpty() && categoryId != null){

            // loadListFood(categoryId);

        }





    }


/*

    private void loadListFood(String categoryID){

        adapter = new FirebaseRecyclerAdapter<Products, ProductViewHolder>(Products.class,

                R.layout.product_item,

                ProductViewHolder.class,

                fruitList.orderByChild("MenuId").equalTo(categoryId)) {
            @Override
            public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
                return null;
            }

            @Override
            protected void onBindViewHolder(@NonNull ProductViewHolder holder, int position, @NonNull Products model) {

            } //like Select * from Foods where MenuID =

            @NonNull
            @Override


            protected void populateViewHolder(ProductViewHolder viewHolder, Products model, int position) {

                viewHolder.txtProductName.setText(model.getPname());

                Picasso.get().load(model.getImage()).into(viewHolder.imageView);



                final Products local = model;

                viewHolder.setItemClickListner(new ItemClickListner() {


                    @Override

                    public void onClick(View view, int position, boolean isLongClick) {

                        //start new activity

                        Intent foodDetail =  new Intent(FruitList.this, FruitDetials.class);

                        foodDetail.putExtra("FoodId", adapter.getRef(position).getKey());

                        startActivity(foodDetail);

                    }

                });

            }

        };

        //Set Adapter

        Log.d("TAG", ""+adapter.getItemCount());

        recyclerView.setAdapter(adapter);

    }
*/
}