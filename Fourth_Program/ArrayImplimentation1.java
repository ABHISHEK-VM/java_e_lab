package Fourth_Program;
// 1.Write a program that uses two arrays of size 5. One

// string array for storing names of students and one int array
// for storing marks obtained by the students. Assign values to the elements in
// the arrays. Print names and marks of students who have scored more than 35
// marks.package Fourth_Program;

public class ArrayImplimentation1 {
    public static void main(String[] args) {

        String[] names = { "Abhishek V M", "Adithya Vikram", "Adnan Shajahan", "Advaitha Jayakumar", "Adwaidth M",
                "Akash S" };
        int[] marks = { 21, 59, 67, 87, 34, 23 };

        for (int i = 0; i < names.length; i++) {

            if (marks[i] > 35) {

                System.out.println(names[i] + " scored " + marks[i] + " marks.");
            }
        }
    }
}
