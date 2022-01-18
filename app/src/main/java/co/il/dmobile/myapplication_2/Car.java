package co.il.dmobile.myapplication_2;

import java.io.Serializable;

public class Car implements Serializable {
    private int Image;
    private String Model;
    private String Brand;
    private String Year;
    private String Price;

    public int getImage() {
        return Image;
    }

    public String getModel() {
        return this.Model;
    }

    public String getBrand() {
        return this.Brand;
    }

    public String getYear() {
        return this.Year;
    }

    public String getPrice() {
        return this.Price;
    }

    public Car(int image, String model, String brand, String year, String price) {
        this.Image = image;
        this.Model = model;
        this.Brand = brand;
        this.Year = year;
        this.Price = price;
    }

}
