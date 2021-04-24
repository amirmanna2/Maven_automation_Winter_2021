package Day3_031321;

public class ifElseIfElseCondition {

    public static void main(String[] args) {

        // using multiple conditional statements
        int a, b, c;
        a = 2;
        b = 2;
        c = 4;

        // verify either a=b > c, a+b <c, a+b = c
        if (a+b > c){
            System.out.println("a & b is greater than c");
        }
        else if (a+b < c) {
            System.out.println("a & b is less than c");
        }
        else {
            System.out.println("a & b is is equal to c");
        }

    } // end of main method
} // end of java class
