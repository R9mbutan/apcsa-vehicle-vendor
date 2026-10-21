public class Car extends Vehicle {
    //setup attributes
    private String carType; //e.g. sedan, coupe, suv, crossover
    private boolean isEV; //affects depreciation
    private boolean isStreetLegal; //drives up price if not
    private String drivetrainLayout; //FWD, RWD, AWD, 4WD


    //@Override 
    // calculates and sets sellPrice
    public double calculateValue() {
        double output = value;
        //15 cents per mile
        output -= 0.15*mileage;
        //1000 bucks down for every year, if EV then lose 1500 bucks for every year
        output -= (year-2026)*1000*((isEV) ? 1.5 : 1);
        //not street legal? jack up by 1.5x
        if (isStreetLegal) output *= 1.5;
        return output;
    } 

    //constructor
    public Car(String mk, String mdl, int yr, int mlg, double v, String cT, boolean iE, boolean iSL, String dL){
        super(mk,mdl,yr,mlg,v);
        this.carType = cT;
        this.isEV = iE;
        this.isStreetLegal = iSL;
        this.drivetrainLayout = dL;
    }
    //toString
    public String toString(){
        return year + " " + make + " " + model + " (" + drivetrainLayout + ") " + carType +  " with " + mileage + " miles with a market value of $" + value + ((isStreetLegal == false) ? " that is not street legal." : ".");
    }
}