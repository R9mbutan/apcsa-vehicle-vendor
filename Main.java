public class Main {
    public static void main(String[]args){
        Car camry = new Car("Toyota", "Camry XSE", 2025, 35904, 34000, "sedan", false, true, "AWD");
        System.out.println(camry);
        Car p1 = new Car("McLaren", "P1 GTR", 2014, 608, 3000000, "coupe", false, false, "RWD");
        System.out.println(p1);
        Rotorcraft mh6 = new Rotorcraft("Boeing", "MH-6 \"Little Bird\"", 1980, 2034, 4500000, true, 1, false);
        System.out.println(mh6);
        Rotorcraft m24 = new Rotorcraft("Magni", "M-24 \"Orion\"", 2010, 2057, 90000, false, 1, false);
        System.out.println(m24);
        Plane f35 = new Plane("Lockheed Martin", "F-35C Lightning II", 2015, 204033, 120000000, true, "fixed wing", 1, true);
        System.out.println(f35);
        //Harley-Davidson VRSCR Street Rod (2006–2007)
        Motorcycle vrscr = new Motorcycle("Harley-Davidson", "VRSCR Street Rod", 2007, 20000, 5000, "Harley", 1130);
        System.out.println(vrscr);

        System.out.println(p1.calculateValue());
        System.out.println(vrscr.calculateValue());
        System.out.println(mh6.calculateValue());
        System.out.println(f35.calculateValue());
    }
}