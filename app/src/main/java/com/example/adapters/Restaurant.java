package com.example.adapters;

// Restaurant.java
import java.util.List;


public class Restaurant {
    private String name;
    private float rating;
    private String deliveryTime;
    private List<MenuItem> menuItems;

    public Restaurant(String name, float rating, String deliveryTime, List<MenuItem> menuItems) {
        this.name = name;
        this.rating = rating;
        this.deliveryTime = deliveryTime;
        this.menuItems = menuItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }
}
