package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ID : ");
        String id = sc.next();

        System.out.print("Grade : ");
        char grade = sc.next().charAt(0);

        System.out.print("Salary : ");
        float sal = sc.nextFloat();

        try (FileWriter file = new FileWriter("MyFile.txt")) {
            file.write("ID : " + id + "\n" + "Grade : " + grade + "\n" + "Salary : " + sal);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        try {
            File file = new File("MyFile.txt");
            sc = new Scanner(file);

            id = sc.nextLine().replace("ID : ", "");
            grade = sc.nextLine().replace("Grade : ", "").charAt(0);
            sal = Float.parseFloat(sc.nextLine().replace("Salary :", ""));

            System.out.println("ID : " + id + "\n" + "Salary : " + sal + "\n" + "allowance : " +
                    switch (grade) {
                        case '1' -> sal * 0.25;
                        case '2' -> sal * 0.15;
                        case '3' -> sal * 0.125;
                        case '4' -> sal * 0.1;
                        default -> -1;
                    });

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
