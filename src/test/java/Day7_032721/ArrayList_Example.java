package Day7_032721;

import java.util.ArrayList;

public class ArrayList_Example {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Brooklyn");
        cities.add("Bronx");
        cities.add("Manhattan");
        cities.add("Queens");

        for(int i=0; i<cities.size(); i++){
            System.out.println("My city is " + cities.get(i));
        }


    } // end of main method
} // end of java class
