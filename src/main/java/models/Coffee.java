package models;

public class Coffee {

    private int id;
    private String roast;
    private double price;
    private String country;
    private int quantity;

    public Coffee(int id, String roast, double price, String country, int quantity){

        this.id = id;
        this.roast = roast;
        this.price = price;
        this.country = country;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
