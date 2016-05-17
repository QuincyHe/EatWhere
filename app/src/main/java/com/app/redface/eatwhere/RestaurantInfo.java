package com.app.redface.eatwhere;

/**
 * Created by Quincy on 5/16/2016.
 */
public class RestaurantInfo {
    private String restaurantName;
    private int cost;//几费?

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public RestaurantInfo(String restaurantName, int cost) {
        this.setRestaurantName(restaurantName);
        this.setCost(cost);
    }

    public String toString() {
        return this.restaurantName + " : " + this.cost + "费";
    }
}
