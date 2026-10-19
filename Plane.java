public class Plane extends Vehicle {
    private boolean isJet; //drives up price
    private String wingLayout; //delta wing, rectangular, etc. 
    private int engines; //number of engines affects price
    private boolean isExMilitary; //jacks up price drastically because rare


    //@Override 
    // calculates and sets sellPrice
    public double calculateValue() {
        double output = value;
        output -= 40*mileage;
        output -= (year-2026)*1000;
        if (isJet) output *= 1.25;
        if (isExMilitary) output *= 1.5;
        return output;
    } 

    //constructor
    public Plane(String mk, String mdl, int yr, int mlg, double v, boolean iJ, String wL, int e, boolean iEM){
        super(mk,mdl,yr,mlg,v);
        this.isJet = iJ;
        this.wingLayout = wL;
        this.engines = e;
        this.isExMilitary = iEM;
    }
    //toString
    public String toString(){
        return (isExMilitary ? "Ex-Military " : "") + year + " " + make + " " + model + " with " + mileage + " miles with a market value of $" + value + ". It is " + (isJet ? "a jet" : "not a jet") + " with " + wingLayout + " wings and " + engines + " engines";
    }
}