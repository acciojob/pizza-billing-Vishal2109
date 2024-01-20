package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            price = 300;
            bill = "Base Price Of The Pizza: 300";
        }
        else{
            price = 400;
            bill = "Base Price Of The Pizza: 400";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price += 80;
        bill += "\n Extra Cheese Added: 80";
    }

    public void addExtraToppings(){
        if(isVeg){
            price += 70;
            bill += "\n Extra Toppings Added: 70";
        }
        else{
            price += 120;
            bill += "\n Extra Toppings For Non-veg Pizza = 120";
        }
    }

    public void addTakeaway(){
        // your code goes here
        price += 20;
        bill += "\n Paper bag Price = 20";
    }

    public String getBill(){
        bill += "\n Total Price: " + price;
        return this.bill;
    }
}
