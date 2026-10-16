public class Car extends Vehicle {
    //setup attributes
    private String carType; //e.g. sedan, coupe, suv, crossover
    private boolean isEV; //affects depreciation
    private boolean isStreetLegal; //drives up price if not
    private String drivetrainLayout; //FWD, RWD, AWD, 4WD


    //@Override 
    public double calculateValue(){
        return 10;
    }

    //constructor
    public Car(String mk, String mdl, int yr, int mlg, double bP, double v, String cT, boolean iE, boolean iSL, String dL){
        super(mk,mdl,yr,mlg,bP,v);
        this.carType = cT;
        this.isEV = iE;
        this.isStreetLegal = iSL;
        this.drivetrainLayout = dL;
    }
}