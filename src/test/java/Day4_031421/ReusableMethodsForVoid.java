package Day4_031421;

public class ReusableMethodsForVoid {


    // create a reusable method which ill add two numbers and print out the statement

    public static void addTwoNumbers(int number1, int number2) {

        System.out.println("My result is " + (number1 + number2));

        int result = ReusableMethodsForReturn.subtractTwoNumbers(20, 10);
        System.out.println("New result " + (result-5));

    } //end of method

} // end of java class
