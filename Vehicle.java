public class Vehicle {
    protected String make; //reference info - irrelevant to evaluation
    protected String model; //reference info - irrelevant to evaluation
    protected int year; //older = less value
    protected int mileage; //more miles = lower price
    protected double value; //what the dealership sells as. Used as market value

    //Vehicle methods

    //changes sellPrice
    public void setPrice(double num) {
        value = num;
    }

    // calculates and sets sellPrice
    public double calculateValue() {
        return ((value) - (0.15*mileage)) - (year-2026)*1000;
    } 

    //constructor
    public Vehicle(String mk, String mdl, int yr, int mlg, /*double bP,*/ double v) {
        this.make = mk;
        this.model = mdl;
        this.year = yr;
        this.mileage = mlg;
        this.value = v;
    }
    public String toString(){
        return year + " " + make + " " + model + " with " + mileage + " miles with a market value of $" + value;
    }




}