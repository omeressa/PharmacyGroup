package com.example.user2.PharmacyProduct.Model;

public class Order {

    private String ProductId;

    private String ProductName;

    private String Price;





    public Order(String babyproductId, String pname, String number) {

    }



    public Order(String productId, String productName, String quanlity, String price, String discount) {

        ProductId = productId;

        ProductName = productName;



        Price = price;



    }



    public String getProductId() {

        return ProductId;

    }



    public void setProductId(String productId) {

        ProductId = productId;

    }



    public String getProductName() {

        return ProductName;

    }



    public void setProductName(String productName) {

        ProductName = productName;

    }


    public String getPrice() {

        return Price;

    }


    public void setPrice(String price) {

        Price = price;

    }



}