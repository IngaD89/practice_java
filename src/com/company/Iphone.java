package com.company;

public class Iphone {
    private IphoneModel model;
    private double price;
    private boolean isWatherResistent;

    public Iphone() {}

    public Iphone(IphoneModel model, double price, boolean isWatherResistent) {
        this.model = model;
        this.price = price;
        this.isWatherResistent = isWatherResistent;
    }

    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWatherResistent() {
        return isWatherResistent;
    }

    public void setWatherResistent(boolean watherResistent) {
        this.isWatherResistent = watherResistent;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWatherResistent=" + isWatherResistent +
                '}';
    }


}
