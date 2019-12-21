package com.example.user2.PharmacyProduct.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.user2.PharmacyProduct.Interface.ItemClickListner;
import com.example.user2.fruitsvegetables.R;


public class CartViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

    public TextView txtProductName, txtProductPrice, txtProductQuanity;
    private ItemClickListner itemClickListner;

    public CartViewHolder(@NonNull View itemView) {
        super(itemView);

        txtProductName = itemView.findViewById(R.id.product_name);
        txtProductPrice = itemView.findViewById(R.id.product_price);
       // txtProductQuanity = itemView.findViewById(R.id.product);


    }


    @Override
    public void onClick(View view) {
        itemClickListner.onClick( view, getAdapterPosition(), false);

    }

    public void setItemClickListner(ItemClickListner itemClickListner) {
        this.itemClickListner = itemClickListner;
    }
}
