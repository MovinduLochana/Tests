import java.util.Arrays;
import java.util.Scanner;

public class IT24100345Lab8Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] studentsArray = new int[8];

        for (int i = 0; i < studentsArray.length;) {
            System.out.printf("Enter ID for Student %d : ", (i+1));

            int x = sc.nextInt();
            if(x <= 0) {
                System.out.println("Please Only Enter Positive Number");
                continue;
            }
            studentsArray[i] = x;
            i++;
        }

        System.out.print("\nEnter ID to Check : ");
        int id = sc.nextInt();

        if(Arrays.stream(studentsArray).anyMatch(i -> i == id)) {
            System.out.println("Student Available");
            return;
        }

        System.out.println("\nStudent Not Available");

    }
}
