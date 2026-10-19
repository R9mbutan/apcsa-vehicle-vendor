public class Rotorcraft extends  Vehicle {
    private boolean isHelicopter; //either helicopter or other - other is classified as gyroplane for simplicity
    private int mainRotors; //1 or 2 - affects price
    private boolean isTandemOrCoaxial; //increases price


    //@Override 
    // calculates and sets sellPrice
    public double calculateValue() {
        double output = value;
        output -= 40*mileage;
        output -= (year-2026)*1000;
        output += mainRotors*15000;
        if (isTandemOrCoaxial) output *= 1.5;
        return output;
    } 

 //constructor
    public Rotorcraft(String mk, String mdl, int yr, int mlg, double v, boolean iH, int mR, boolean iTOC){
        super(mk,mdl,yr,mlg,v);
        this.isHelicopter = iH;
        this.mainRotors = mR;
        this.isTandemOrCoaxial = iTOC;
    }

    //toString
    public String toString(){
        return year + " " + make + " " + model + " with " + mileage + " miles with a market value of $" + value + ". It is a " + ((isHelicopter) ? "helicopter " : "gyroplane ") + "with " + mainRotors + " rotors.";
    }
}