import java.util.Scanner;
//scanner fuction use for taking inpu from user

 //This function is to perform arithmatic operations

public class ArithmaticOperations {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    // Taking input from user
    System.out.println("Enter first number :");
    int num1 = scan.nextInt();
    System.out.println("Enter second number :");
    int num2 = scan.nextInt();
    
    
    // Now Perform arithmatic operations
    
    int addition        = (num1 + num2);
    int substraction    = (num1 - num2);
    int multiplication  = (num1 * num2);
    int division        = (num1 / num2);
    
    // now we have to print result to console
    
    System.out.println("Addition : "       + addition );
    System.out.println("Substraction : "   + substraction);
    System.out.println("Multiplication : " + multiplication);
    System.out.println("Division : "       + division);
    }
}
