package com.techelevator;

public abstract class CandyItem { //should abstract because candy does not mean anything if it does not have items
    private String name;
    private double price;
    private String id;

    private int quantity = 25;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getIsIndividuallyWrapped() {
        return isIndividuallyWrapped;
    }

    private String isIndividuallyWrapped;




    public abstract String getCandyType ();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String isIndividuallyWrapped() {
        return isIndividuallyWrapped;
    }

    public void setIndividuallyWrapped(String individuallyWrapped) {
        isIndividuallyWrapped = individuallyWrapped;
    }
}
