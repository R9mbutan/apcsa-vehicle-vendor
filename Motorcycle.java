public class Motorcycle extends Vehicle {
    private String bikeType; //e.g. dirt, sport, cruise
    private int engineSize; //in cc, increases depreciation



    //constructor
    public Motorcycle(String mk, String mdl, int yr, int mlg, double bP, double v, String bT, int eS){
        super(mk,mdl,yr,mlg,bP,v);
        this.bikeType = bT;
        this.engineSize = eS;
    }
}