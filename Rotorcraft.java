public class Rotorcraft extends  Vehicle {
    private boolean isHelicopter; //either helicopter or other - other is classified as gyroplane for simplicity
    private int mainRotors; //1 or 2 - affects price
    private boolean isTandemOrCoaxial; //increases price

 //constructor
    public Rotorcraft(String mk, String mdl, int yr, int mlg, double bP, double v, boolean iH, int mR, boolean iTOC){
        super(mk,mdl,yr,mlg,bP,v);
        this.isHelicopter = iH;
        this.mainRotors = mR;
        this.isTandemOrCoaxial = iTOC;
    }
}