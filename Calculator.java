import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int choice = 1;

        while(choice != 8){

            System.out.println("1 for addition \n2 for subtraction\n3 for multiplication\n4 for division \n5 for modulus");
            choice = scanner.nextInt();


            
            switch (choice) {
                case 1:
                    System.out.println("Enter first number : ");
                    double number1 = scanner.nextInt();
                    System.out.println("Enter second number : ");
                    double number2 = scanner.nextInt();    
                    System.out.println("The sum of " + number1 + " and " + number2 + " is : " + add(number1, number2));
                    break;
                case 2:
                    System.out.println("Enter first number : ");
                    number1 = scanner.nextInt();
                    System.out.println("Enter second number : ");
                    number2 = scanner.nextInt();   
                    System.out.println(
                            "The difference of " + number1 + " and " + number2 + " is : " + subtract(number1, number2));
                    break;
                case 3:
                    System.out.println("Enter first number : ");
                    number1 = scanner.nextInt();
                    System.out.println("Enter second number : ");
                    number2 = scanner.nextInt();   
                    System.out.println(
                            "The product of " + number1 + " and " + number2 + " is : " + multiply(number1, number2));
                    break;
                case 4:
                    System.out.println("Enter first number : ");
                    number1 = scanner.nextInt();
                    System.out.println("Enter second number : ");
                    number2 = scanner.nextInt();   
                    System.out.println(
                            "The quotient of " + number1 + " and " + number2 + " is : " + divide(number1, number2));
                    break;

                case 5:
                    System.out.println("Enter the number : ");
                    number1 = scanner.nextInt();
                    System.out.println("The square of " + number1 + " is : " + square(number1));
                    break;
                case 6:
                    System.out.println("Enter the number : ");
                    number1 = scanner.nextInt();
                    System.out.println("The square root of " + number1 + " is : " + factorial(number1));
                    break;


                default:
                    System.out.println("Invalid Entry");
                    break;
                        
          


        }
       

        

        
        
    }
}
