package Day4_031421;

public class ActionItem2_Assignment3 {

    public static void main(String[] args) {

        String[] cities = new String[4];

        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Staten Island";


        for(int i = 0; i < cities.length; i++){
            if(cities[i] == "Brooklyn"){
                System.out.println("Country is " + cities[i]);
            }else if(cities[i] == "Manhattan"){
                System.out.println("Country is " + cities[i]);
            }// end of conditional statement


        } // end of for loop

    } // end of main method

} // end of java class