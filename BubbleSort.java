import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            System.out.print("Enter element number " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }

        bubbleSort(array);

        System.out.println("\nnew array : ");

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");

        }

    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < (array.length - 1 - i); j++) {

                if (array[j] > array[j + 1]) {
                    int temp;
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
        return array;

    }

}
