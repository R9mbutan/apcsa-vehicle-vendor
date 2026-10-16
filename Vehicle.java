import java.util.*;
public class Vehicle {
    protected String make; //reference info - irrelevant to evaluation
    protected String model; //reference info - irrelevant to evaluation
    protected int year; //older = less value
    protected int mileage; //more miles = lower price
    protected double buyPrice; //what the dealership buys for
    protected double value; //what the dealership sells as. Used as market value

    //Vehicle methods

    //changes sellPrice
    public void setPrice(double num) {
        value = num;
    }

    // calculates and sets sellPrice
    public double calculateValue(double msrp, int year, int mileage) {
        return 0.0;
    } 

    //buys a vehicle
    public Vehicle buy(double price, Vehicle whatIsBought) {
        return whatIsBought;
    }

    //constructor
    public Vehicle(String mk, String mdl, int yr, int mlg, double bP, double v) {
        this.make = mk;
        this.model = mdl;
        this.year = yr;
        this.mileage = mlg;
        this.buyPrice = bP;
        this.value = v;
    }
    public String toString(){
        return "It is a " + year + " " + make + " " + model + " with " + mileage + " miles with a market value of " + value;
    }




}