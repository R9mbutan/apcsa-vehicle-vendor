import java.util.ArrayList;

public class VendorRunner {

    //runner class stuff: 
    //initial capital of $1M
    public static double vendorMoney = 100000000;
    public static ArrayList<Vehicle> garage = new ArrayList<>(); 
    
    //buys a vehicle (changes money, adds car to garage)
    public static void buy(Vehicle whatIsBought) {
        if (vendorMoney >= whatIsBought.calculateValue()) {
            vendorMoney -= whatIsBought.calculateValue();
            garage.add(whatIsBought);
            System.out.println("You paid $" + whatIsBought.calculateValue() + " to buy " + whatIsBought + ". Remaining balance: $" + vendorMoney);
        }
        else
            System.out.println("You are too broke to afford " + whatIsBought);
    }
    //sell
    public static void sell(Vehicle whatIsSold) {
        if (garage.indexOf(whatIsSold) != -1) {
            vendorMoney += whatIsSold.calculateValue();
            garage.remove(whatIsSold);
            System.out.println("You sold " + whatIsSold + ". New balance: $" + vendorMoney);
        }
        else
            System.out.println("You do not have " + whatIsSold);
    }
    //get garage
    public static String getVehicles(){
        String output = "Your vehicles are: \n\n";
        for (Vehicle v : garage) {
            output += v + "\n\n";
        }
        return output;
    }
    //get balance
    public static double getBalance() {
        return vendorMoney;
    }

    public static void main(String[]args){

        //Welcome
        System.out.println("Hello user!");

        //Create a buttload of vehicle objects
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
        Motorcycle vrscr = new Motorcycle("Harley-Davidson", "VRSCR Street Rod", 2007, 20000, 5000, "Harley", 1130);
        System.out.println(vrscr);
        Car rav4 = new Car("Toyota", "RAV4 Hybrid AWD", 2026, 3800, 36500, "SUV", false, false, "AWD");
        System.out.println(rav4);
        Car taycan = new Car("Porsche", "Taycan Turbo GT with Weissach Package and Manthey Kit", 2026, 0, 370000, "sedan", true, true, "AWD");
        System.out.println(taycan);
        Car mustang = new Car("Ford", "Mustang Dark Horse", 2024, 3949, 64200, "coupe", false, true, "RWD");
        System.out.println(mustang);
        Rotorcraft ec135 = new Rotorcraft("Airbus", "H135 (EC135)", 2018, 3200, 5700000, false, 1, false);
        System.out.println(ec135);
        Rotorcraft ch47 = new Rotorcraft("Boeing", "CH-47F Chinook", 2012, 24500, 32000000, true, 2, false);
        System.out.println(ch47);
        Rotorcraft ka52 = new Rotorcraft("Kamov", "Ka-52 Alligator", 2011, 17600, 16000000, true, 2, true);
        System.out.println(ka52);

        /*
        buy(p1);
        buy(camry);
        buy(mh6);
        sell(p1);
        sell(vrscr);
        buy(taycan);
        System.out.println(getVehicles());
        sell(camry);
        */

    }
}