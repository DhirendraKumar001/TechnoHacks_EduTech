import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Dhirendra's Calculator");
        
        while (true) {
            System.out.println("Please select an operation:");
            System.out.println("1: for Addition (+)");
            System.out.println("2: for Subtraction (-)");
            System.out.println("3: for Multiplication (*)");
            System.out.println("4: for Division (/)");
            System.out.println("5: for Modulus (%)");
            System.out.println("6: for Exit");

            int choice = sc.nextInt();

            if (choice == 6) {
                System.out.println("Exiting");
                break;
            }

            System.out.println("Enter the first number:");
            double n1 = sc.nextDouble();

            System.out.println("Enter the second number:");
            double n2 = sc.nextDouble();

            double result = 0;

            if (choice == 1) {
                result = n1 + n2;
                System.out.println("Result: " + n1 + " + " + n2 + " = " + result);
            } else if (choice == 2) {
                result = n1 - n2;
                System.out.println("Result: " + n1 + " - " + n2 + " = " + result);
            } else if (choice == 3) {
                result = n1 * n2;
                System.out.println("Result: " + n1 + " * " + n2 + " = " + result);
            } else if (choice == 4) {
                if (n2 != 0) {
                    result = n1 / n2;
                    System.out.println("Result: " + n1 + " / " + n2 + " = " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                } 
            } else if(choice == 5){
                result = n1 % n2;
                System.out.println("Result: " + n1 + " / " + n1 + " = " + result);   
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}
