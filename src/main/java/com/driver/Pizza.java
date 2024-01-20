package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private boolean extraCheeseAdded = false;
    private boolean extraToppingsAdded = false;
    private boolean billed = false;
    private boolean takeAway = false;

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
        if(!extraCheeseAdded){
            price += 80;
            bill += "\nExtra Cheese Added: 80";
            this.extraCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        if(!extraToppingsAdded){
            if(isVeg){
                price += 70;
                bill += "\nExtra Toppings Added: 70";
            }
            else{
                price += 120;
                bill += "\nExtra Toppings Added: 120";
            }
            this.extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeAway){
            takeAway = true;
            price += 20;
            bill += "\nPaperbag Added: 20";
        }
    }

    public String getBill(){
        if(!billed){
            bill += "\nTotal Price: " + price + "\n";
            this.billed = true;
        }
        return this.bill;
    }
}
