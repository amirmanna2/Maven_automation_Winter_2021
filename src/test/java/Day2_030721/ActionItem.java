package Day2_030721;

public class ActionItem {

    public static void main(String[] args) {

        String[] zipCode;
        int[] streetNumber;


        zipCode = new String [4];
        zipCode [0] = "10462";
        zipCode [1] = "10463";
        zipCode [2] = "10464";
        zipCode [3] = "10465";

        streetNumber = new int [4];
        streetNumber [0] = 2217;
        streetNumber [1] = 2218;
        streetNumber [2] = 2219;
        streetNumber [3] = 2220;

        for (int i = 0; i < zipCode.length; i++) {
            //print out all values in one print statement

            System.out.println("My zipcode is " + zipCode[i] + " and my street number is " + streetNumber[i]);
        } // end of while loop
    } // end of main method

} // end of java class