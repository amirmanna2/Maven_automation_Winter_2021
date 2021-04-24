package Day3_031321;

public class switchCaseStatements {

    public static void main(String[] args) {

        /* using switch case statements print
            if milkType is oat milk, almond milk, or organic milk
            else milk type is not recognized
         */

        // declare and define the variable for milkType
        String milkType =  "soy milk";

        switch (milkType){

            case "oat milk":
                System.out.println("Milk type is oat milk");
               break;
            case "almond milk":
                System.out.println("Milk type is almond milk");
                break;
            case "organic milk":
                System.out.println("Milk type is organic milk");
                break;

            default:
                System.out.println("Milk type " + milkType + " is not recognized");
                break;

        } // end of switch statement


    } // end of main method
} // end of java class
