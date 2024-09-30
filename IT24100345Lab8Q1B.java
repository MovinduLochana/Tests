import java.util.Arrays;
import java.util.Scanner;

public class IT24100345Lab8Q1B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Enter Number %d : ", (i + 1));
            nums[i] = sc.nextInt();
        }

        System.out.print("Reverse : ");
        for (int i = nums.length - 1; i >= 0; i--) System.out.print(nums[i] + " ");


        int[] evenArr = Arrays.stream(nums).filter(i -> i % 2 == 0).toArray();

        System.out.print("\nEvens : ");
        for (int i : evenArr) System.out.print(i + " ");

    }
}
