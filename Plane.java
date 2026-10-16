public class Plane extends Vehicle {
    private boolean isJet; //drives up price
    private String wingLayout; //delta wing, rectangular, etc. 
    private int engines; //number of engines affects price
    private boolean isExMilitary; //jacks up price drastically because rare

    //constructor
    public Plane(String mk, String mdl, int yr, int mlg, double bP, double v, boolean iJ, String wL, int e, boolean iEM){
        super(mk,mdl,yr,mlg,bP,v);
        this.isJet = iJ;
        this.wingLayout = wL;
        this.engines = e;
        this.isExMilitary = iEM;
    }
}