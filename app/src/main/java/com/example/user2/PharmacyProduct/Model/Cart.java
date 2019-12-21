package com.example.user2.PharmacyProduct.Model;

public class Cart {

    private String pid , pname , price , quanity;

    public Cart() {
    }

    public Cart(String pid, String pname, String price, String quanity) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quanity = quanity;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuanity() {
        return quanity;
    }

    public void setQuanity(String quanity) {
        this.quanity = quanity;
    }
}
