import java.util.Scanner;

public class Recursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scanner.nextInt();
        System.out.println("Factorial of " + number + " is : " + factorial(number));

    }

    public static double factorial(int number) {

        if (number == 0) {
            return 1;

        } else {
            double result = number * factorial(number - 1);
            return result;
        }

    }

}
