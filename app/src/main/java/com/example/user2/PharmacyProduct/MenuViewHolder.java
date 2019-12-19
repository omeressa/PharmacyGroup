package com.example.user2.PharmacyProduct;




import android.support.v7.widget.RecyclerView;

import android.view.View;

import android.widget.AdapterView;
import android.widget.ImageView;

import android.widget.TextView;

import com.example.user2.fruitsvegetables.R;


public class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{



    public TextView txtMenuName;

    public ImageView imageView;



    private AdapterView.OnItemClickListener itemClickListener;



    public MenuViewHolder(View itemView){

        super(itemView);



        txtMenuName = itemView.findViewById(R.id.menu_name);

        imageView = itemView.findViewById(R.id.menu_image);



        itemView.setOnClickListener(this);



    }



    public void setItemClickListener(AdapterView.OnItemClickListener itemClickListener) {

        this.itemClickListener = itemClickListener;

    }



    @Override

    public void onClick(View view)

    {

       //temClickListener.onItemClick(view, getAdapterPosition(), false);

    }

}