/*
int a_number=1; // (range: 1 to 5 including both)

Print the value of a_number in word. For example, it should print “Four” if a_number contains 4.
  
1.Use equality ‘= =’
operator.

2.Do not use equality ‘= =’
operator.
*/

package Third_program;

public class DigitToWord {
    public static void main(String[] args) {

        int aNumber = 2;

        if (aNumber == 1) {
            System.out.println("One");
        } else if (aNumber == 2) {
            System.out.println("Two");
        } else if (aNumber == 3) {
            System.out.println("Three");
        } else if (aNumber == 4) {
            System.out.println("Four");
        } else if (aNumber == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Invalid Entry");
        }

        switch (aNumber) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                break;
        }
    }

}
