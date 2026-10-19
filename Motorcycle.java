public class Motorcycle extends Vehicle {
    private String bikeType; //e.g. dirt, sport, cruise
    private int engineSize; //in cc, increases depreciation


    //@Override 
    // calculates and sets sellPrice
    public double calculateValue() {
        double output = value;
        output -= 0.15*mileage;
        output -= engineSize*0.03 * (2026 - year);
        return output;
    } 

    //constructor
    public Motorcycle(String mk, String mdl, int yr, int mlg, double v, String bT, int eS){
        super(mk,mdl,yr,mlg,v);
        this.bikeType = bT;
        this.engineSize = eS;
    }
    //toString
    public String toString(){
        return year + " " + make + " " + model + " " + bikeType + " with " + mileage + " miles with a market value of $" + value + " with a " + engineSize + "cc engine.";
    }
}