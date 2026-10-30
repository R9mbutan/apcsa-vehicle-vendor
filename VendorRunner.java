import java.util.ArrayList;
import java.util.Scanner;

public class VendorRunner {

    //runner class stuff: 
    //initial capital of $1M
    public static double vendorMoney = 1000000;
    public static ArrayList<Vehicle> garage = new ArrayList<>(); 
    public static ArrayList<Vehicle> environ = new ArrayList<>();
    
    //buys a vehicle (changes money, adds car to garage)
    public static void buy(Vehicle whatIsBought) {
        if (vendorMoney >= whatIsBought.calculateValue()) {
            vendorMoney -= whatIsBought.calculateValue();
            environ.remove(whatIsBought);
            garage.add(whatIsBought);
            
            System.out.println("You paid $" + Vehicle.formatNum(whatIsBought.calculateValue()) + " to buy " + whatIsBought + ". Remaining balance: $" + Vehicle.formatNum(vendorMoney));
        }
        else
            System.out.println("You are too broke to afford " + whatIsBought);
    }
    //sell
    public static void sell(Vehicle whatIsSold) {
        if (garage.indexOf(whatIsSold) != -1) {
            vendorMoney += whatIsSold.getSellValue();
            garage.remove(whatIsSold);
            environ.add(whatIsSold);
            System.out.println("You sold " + whatIsSold + " for $" + Vehicle.formatNum(whatIsSold.getSellValue()) + ". New balance: $" + Vehicle.formatNum(vendorMoney));
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
        environ.add(camry);
        Car p1 = new Car("McLaren", "P1 GTR", 2014, 608, 3000000, "coupe", false, false, "RWD");
        environ.add(p1);
        Rotorcraft mh6 = new Rotorcraft("Boeing", "MH-6 \"Little Bird\"", 1980, 2034, 4500000, true, 1, false);
        environ.add(mh6);
        Rotorcraft m24 = new Rotorcraft("Magni", "M-24 \"Orion\"", 2010, 2057, 90000, false, 1, false);
        environ.add(m24);
        Plane f35 = new Plane("Lockheed Martin", "F-35C Lightning II", 2015, 204033, 120000000, true, "fixed wing", 1, true);
        environ.add(f35);
        Motorcycle vrscr = new Motorcycle("Harley-Davidson", "VRSCR Street Rod", 2007, 20000, 5000, "Harley", 1130);
        environ.add(vrscr);
        Car rav4 = new Car("Toyota", "RAV4 Hybrid AWD", 2026, 3800, 36500, "SUV", false, true, "AWD");
        environ.add(rav4);
        Car taycan = new Car("Porsche", "Taycan Turbo GT with Weissach Package and Manthey Kit", 2026, 0, 370000, "sedan", true, true, "AWD");
        environ.add(taycan);
        Car mustang = new Car("Ford", "Mustang Dark Horse", 2024, 3949, 64200, "coupe", false, true, "RWD");
        environ.add(mustang);
        Rotorcraft ec135 = new Rotorcraft("Airbus", "H135 (EC135)", 2018, 3200, 5700000, true, 1, false);
        environ.add(ec135);
        Rotorcraft ch47 = new Rotorcraft("Boeing", "CH-47F Chinook", 2012, 24500, 32000000, true, 2, false);
        environ.add(ch47);
        Rotorcraft ka52 = new Rotorcraft("Kamov", "Ka-52 Alligator", 2011, 17600, 16000000, true, 2, true);
        environ.add(ka52);
        //more
        Car civic = new Car("Honda", "Civic EX", 2023, 18500, 24500, "sedan", false, true, "FWD");
        environ.add(civic);
        Car f150 = new Car("Ford", "F-150 Lightning", 2024, 8200, 62000, "truck", true, true, "AWD");
        environ.add(f150);
        Car model3 = new Car("Tesla", "Model 3 Performance", 2025, 4100, 54000, "sedan", true, true, "AWD");
        environ.add(model3);
        Car corvette = new Car("Chevrolet", "Corvette Z06", 2023, 5200, 112000, "coupe", false, true, "RWD");
        environ.add(corvette);
        Car gt3 = new Car("Porsche", "911 GT3 RS", 2024, 1200, 241000, "coupe", false, true, "RWD");
        environ.add(gt3);
        Car mx5 = new Car("Mazda", "MX-5 Miata", 2022, 14200, 28000, "convertible", false, true, "RWD");
        environ.add(mx5);
        Car gtr = new Car("Nissan", "GT-R Nismo", 2021, 9800, 210000, "coupe", false, true, "AWD");
        environ.add(gtr);
        Car outback = new Car("Subaru", "Outback Wilderness", 2024, 12400, 39900, "wagon", false, true, "AWD");
        environ.add(outback);
        Car prius = new Car("Toyota", "Prius Prime", 2024, 6300, 32500, "hatchback", false, true, "FWD");
        environ.add(prius);
        Car m3 = new Car("BMW", "M3 Competition", 2023, 11500, 82000, "sedan", false, true, "AWD");
        environ.add(m3);
        Motorcycle ninja = new Motorcycle("Kawasaki", "Ninja ZX-10R", 2023, 3100, 17700, "Sport", 998);
        environ.add(ninja);
        Motorcycle r1250gs = new Motorcycle("BMW", "R 1250 GS Adventure", 2022, 14800, 20300, "Adventure", 1254);
        environ.add(r1250gs);
        Motorcycle rebel = new Motorcycle("Honda", "Rebel 500", 2021, 6200, 6400, "Cruiser", 471);
        environ.add(rebel);
        Motorcycle panigale = new Motorcycle("Ducati", "Panigale V4 S", 2024, 850, 32100, "Superbike", 1103);
        environ.add(panigale);
        Motorcycle vespa = new Motorcycle("Vespa", "GTS 300", 2023, 2100, 7800, "Scooter", 278);
        environ.add(vespa);
        Plane c172 = new Plane("Cessna", "172 Skyhawk", 2018, 1450, 380000, false, "fixed wing", 1, false);
        environ.add(c172);
        Plane a320 = new Plane("Airbus", "A320neo", 2021, 8400, 110000000, true, "fixed wing", 2, false);
        environ.add(a320);
        Plane b737 = new Plane("Boeing", "737 MAX 8", 2022, 6200, 121000000, true, "fixed wing", 2, false);
        environ.add(b737);
        Plane a10 = new Plane("Fairchild Republic", "A-10C Thunderbolt II", 1982, 9800, 18800000, true, "fixed wing", 2, true);
        environ.add(a10);
        Plane sr71 = new Plane("Lockheed", "SR-71 Blackbird", 1966, 2800, 33000000, true, "delta wing", 2, true);
        environ.add(sr71);
        Plane cirrus = new Plane("Cirrus", "Vision SF50", 2023, 310, 3250000, true, "fixed wing", 1, false);
        environ.add(cirrus);
        Plane spitfire = new Plane("Supermarine", "Spitfire Mk IX", 1943, 1200, 4500000, false, "fixed wing", 1, true);
        environ.add(spitfire);
        Plane p51 = new Plane("North American", "P-51D Mustang", 1944, 1850, 3500000, false, "fixed wing", 1, true);
        environ.add(p51);
        Plane kingair = new Plane("Beechcraft", "King Air 350i", 2019, 2100, 7500000, false, "fixed wing", 2, false);
        environ.add(kingair);
        Rotorcraft ah64 = new Rotorcraft("Boeing", "AH-64E Apache Guardian", 2017, 3400, 52000000, true, 1, false);
        environ.add(ah64);
        Rotorcraft uh60 = new Rotorcraft("Sikorsky", "UH-60M Black Hawk", 2015, 6100, 21000000, true, 1, false);
        environ.add(uh60);
        Rotorcraft r44 = new Rotorcraft("Robinson", "R44 Raven II", 2020, 1100, 520000, true, 1, false);
        environ.add(r44);
        Rotorcraft bell407 = new Rotorcraft("Bell", "407GXi", 2022, 850, 3600000, true, 1, false);
        environ.add(bell407);
        Rotorcraft v22 = new Rotorcraft("Bell Boeing", "V-22 Osprey", 2016, 4800, 71000000, false, 2, false);
        environ.add(v22);
        Rotorcraft s64 = new Rotorcraft("Sikorsky", "S-64 Aircrane", 1998, 12400, 18000000, true, 1, false);
        environ.add(s64);
        Rotorcraft ch53e = new Rotorcraft("Sikorsky", "CH-53E Super Stallion", 2008, 8900, 40000000, true, 1, false);
        environ.add(ch53e);
        Rotorcraft mi24 = new Rotorcraft("Mil", "Mi-24 Hind", 1985, 5200, 12000000, true, 1, false);
        environ.add(mi24);
        Rotorcraft cabri = new Rotorcraft("Guimbal", "Cabri G2", 2021, 650, 380000, true, 1, false);
        environ.add(cabri);
        Rotorcraft gyrocopter = new Rotorcraft("AutoGyro", "Calidus", 2023, 180, 115000, false, 1, false);
        environ.add(gyrocopter);
        Plane su30mkk = new Plane("Sukhoi", "Su-30MKK Flanker G", 2020, 0, 53000000, true, "fixed wing", 2, true);
        environ.add(su30mkk);

        //Scanner
       Scanner s = new Scanner(System.in);
       String input = "";
       //MAIN LOOP
       System.out.println("What would you like to do? \nType HELP for help.");
       
       //exit command
       while(!input.equals("end")) {
        System.out.print("Input: ");
        //support all cases
        input = s.next().toLowerCase();
        //BUYING
        if (input.equals("buy")) {
            //show available
            String available = "";
            for (Vehicle v : environ){
                available += "\n" + (environ.indexOf(v)+1) + ": " + v.getName();
            }

            System.out.println("Available cars: " + available);

            System.out.print("You have $" + (Vehicle.formatNum(vendorMoney))+ ". What would you like to buy? \nInput the corresponding number: ");
            try {
                buy(environ.get(s.nextInt()-1));
            } catch (Exception e) {
                System.out.println("Invalid input!");
            }
        }
        //SELLING
        if (input.equals("sell")) {
            //show garage
            String gar = "";
            for (Vehicle v : garage){
                gar += "\n" + (garage.indexOf(v)+1) + ": " + v.getName();
            }
            //if user has vehicle(s)
            if(gar.length()>0) {
                System.out.print("Your vehicles: " + gar + "\nWhat would you like to sell?\nInput the corresponding number: ");
                try {
                    sell(garage.get(s.nextInt()-1));
                } catch (Exception e) {
                    System.out.println("Invalid input!");
                }
            }
            else System.out.println("You don\'t have any vehicles.");
            
        }
        //VIEWING
        if (input.equals("seegarage")) {
            System.out.println(getVehicles());
        } 

        //INJECTING
        if (input.equals("inject")) {
            System.out.print("Inject how much?: $");
            try{
            vendorMoney += (s.nextDouble());
            System.out.println("New balance: $" + Vehicle.formatNum(vendorMoney));
            } catch(Exception e) { System.out.println("Not an acceptable number!"); }
        }
        //HELP COMMAND
        if (input.equals("help")) {
            System.out.println("\n\"BUY\" to browse the selection and buy a vehicle.\n\"SELL\" to sell a vehicle you own.\n\"SEEGARAGE\" to see your vehicles.\n\"INJECT\" if you want to inject cash into your balance.\n\"HELP\" to view this message.\n\"END\" to stop the program.\n");
        }
    }
       s.close();
       System.out.println("Ending balance: $" + Vehicle.formatNum(getBalance()));
       System.out.println(getVehicles());
       System.out.println("Ending. Bye bye!");
    }
}