package homeworkweek8;

import java.util.ArrayList;

public class Program7_UndergroundTube {
    public static void main(String[] args) {
        ArrayList<String> undergroundtubelist = new ArrayList<>();
        undergroundtubelist.add("Bakerloo Line");
        undergroundtubelist.add("Central Line");
        undergroundtubelist.add("Circle Line");
        undergroundtubelist.add("District Line");
        undergroundtubelist.add("Hammersmith & City Line");
        undergroundtubelist.add("Jubilee Line");
        undergroundtubelist.add("Metropolitan Line Tube");
        undergroundtubelist.add("Northern Line");
        undergroundtubelist.add("Piccadilly Line");
        undergroundtubelist.add("Victoria Line");

        System.out.println("Original array list: " + undergroundtubelist);
        if (undergroundtubelist.isEmpty()) {
            System.out.println("Given array list is empty");
        } else {
            System.out.println("Given array list is not empty");
        }
    }
}