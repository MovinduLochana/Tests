import java.util.Arrays;
import java.util.Scanner;

public class IT24100345Lab8Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[6];

        for (int i = 0; i < nums.length;) {
            System.out.printf("Enter a Positive Number (%d/%d) : ", (i+1), nums.length);

            int x = sc.nextInt();
            if(x < 0) {
                System.out.println("Please Only Enter Positive Number");
                continue;
            }
            nums[i] = x;
            i++;
        }

        System.out.println("\nArrays is : " + Arrays.toString(nums));
        System.out.println("\nMax is : " + Arrays.stream(nums).max().orElse(0));

    }
}
