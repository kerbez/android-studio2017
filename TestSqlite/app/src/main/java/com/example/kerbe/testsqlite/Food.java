package com.example.kerbe.testsqlite;

/**
 * Created by kerbe on 29.09.2017.
 */

public class Food {
    private int id;
    private String name;
    private String price;
    private byte[] image;

    public Food(String name, String price, byte[] image, int id){
        this.name = name;
        this.price = price;
        this.image = image;
        this.id = id;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrice(String price){
        this.price = price;
    }
    public String getPrice(){
        return price;
    }

    public void setImage(byte[] image){
        this.image = image;
    }
    public byte[] getImage(){
        return image;
    }


}
