package tests;

import java.util.Scanner;

/*
Answer to Q3
*/

public class Test3 {
    public static void main(String[] args) {

        // Assertion
        assert calcDiscount('a', 10000) == 2500;
        assert calcDiscount('b', 10000) == 2000;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Card Type : ");
        char type = sc.next().charAt(0);

        System.out.print("Enter Payment : ");
        float payment = sc.nextFloat();

        float discount = calcDiscount(type, payment);
        displayDetails(discount, calNetPayment(discount, payment));
    }

    static float calcDiscount(char c, float payment) {
        return switch (c) {
            case 's' -> payment * 0.25f;
            case 'r' -> payment * 0.2f;
            case 'd' -> payment * 0.15f;
            case 'n' -> 0;
            default -> throw new IllegalStateException("Unexpected value: " + c);
        };
    }

    static  float calNetPayment(float discount,float payment){
        return payment - discount;
    }

    static void displayDetails(float discount, float netPay) {
        //System.out.println("Discount : " + discount + "\t Net Payment : " + netPay);
        System.out.printf("Discount : %.2f \t NetPayment %.2f", discount, netPay);
    }
}
