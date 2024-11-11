import java.util.Scanner;

public class Calculator {

    
    // Addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0; // You can also throw an exception instead
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        // double num1 = 10;
        // double num2 = 5;

        while (keepRunning) {
            // Display menu
            System.out.println("Select operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            System.out.print("Enter choice (1/2/3/4/5): ");
            int choice = scanner.nextInt();
            
             if (choice == 5) {
                // Exit the loop if the user chooses 5
                keepRunning = false;
                System.out.println("Exiting the program.");
            }else if(choice < 1 || choice > 5){
                System.out.println("Invalid, Please select number 1-5");
            }else{
                System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
             double result;
                // Perform calculation based on user's choice
                switch (choice) {
                    case 1:
                        result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 2:
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 3:
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = divide(num1, num2);
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Cannot divide by zero.");
                        }
                        break;                
                }

                System.out.println(); // new line
            }
        }
          scanner.close();
        
        }
    }



