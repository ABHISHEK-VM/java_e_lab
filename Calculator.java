/*Write a Java program to perform Calculator operations.

1.addition
2.Subtraction
3.multiplication
4.Division
5.square
6.square root
7.factorial
8.power/ exponent of a number
*/

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice = 1;

        while (choice != 0) {

            System.out.print(
                    "1 for addition \n2 for subtraction\n3 for multiplication\n4 for division \n5 for square \n6 for square root \n7 for factorial \n8 for power \n0 for EXIT\n\nEnter your choice : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number : ");
                    double number1 = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    double number2 = scanner.nextInt();
                    System.out.println("The sum of " + number1 + " and " + number2 + " is : " + add(number1, number2));
                    break;
                case 2:
                    System.out.print("Enter first number : ");
                    number1 = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    number2 = scanner.nextInt();
                    System.out.println(
                            "The difference of " + number1 + " and " + number2 + " is : " + subtract(number1, number2));
                    break;
                case 3:
                    System.out.print("Enter first number : ");
                    number1 = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    number2 = scanner.nextInt();
                    System.out.println(
                            "The product of " + number1 + " and " + number2 + " is : " + multiply(number1, number2));
                    break;
                case 4:
                    System.out.print("Enter first number : ");
                    number1 = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    number2 = scanner.nextInt();
                    System.out.println(
                            "The quotient of " + number1 + " and " + number2 + " is : " + divide(number1, number2));
                    break;

                case 5:
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextInt();
                    System.out.println("The square of " + number1 + " is : " + square(number1));
                    break;
                case 6:
                    System.out.println("Enter the number : ");
                    number1 = scanner.nextInt();
                    System.out.println("The square root of " + number1 + " is : " + squareRoot(number1));
                    break;

                case 7:
                    System.out.print("Enter the number : ");
                    number1 = scanner.nextInt();
                    System.out.println("The factorial of " + number1 + " is : " + factorial(number1));
                    break;

                case 8:
                    System.out.print("Enter first number : ");
                    number1 = scanner.nextInt();
                    System.out.print("Enter second number : ");
                    number2 = scanner.nextInt();
                    System.out.println(
                            "The power of " + number1 + " and " + number2 + " is : " + power(number1, number2));
                    break;

                case 0:
                    choice = 0;
                    System.out.println("\nExited Successfully!");
                    break;

                default:
                    System.out.println("\nInvalid Entry");
                    break;

            }

        }

    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }

    public static double subtract(double num1, double num2) {
        double result = num1 - num2;
        return result;

    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;

    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

    public static double square(double num) {
        double result = num * num;
        return result;
    }

    public static double squareRoot(double num) {
        double result = Math.sqrt(num);
        return result;
    }

    public static double factorial(double num) {

        if (num == 0) {
            return 1;

        } else {
            double result = num * factorial(num - 1);
            return result;
        }

    }

    public static double power(double num1, double num2) {
        double result = Math.pow(num1, num2);
        return result;
    }

}
