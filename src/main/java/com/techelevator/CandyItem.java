package com.techelevator;

public abstract class CandyItem { //should abstract because candy does not mean anything if it does not have items
    private String name;
    private double price;
    private  boolean isIndividuallyWrapped = false;

    public abstract String getCandyType ();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isIndividuallyWrapped() {
        return isIndividuallyWrapped;
    }

    public void setIndividuallyWrapped(boolean individuallyWrapped) {
        isIndividuallyWrapped = individuallyWrapped;
    }
}
