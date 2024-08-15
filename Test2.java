package tests;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] mat = new int[4][4];

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){

                System.out.print("Enter Element at row " + i + ", column " + j + " : ");
                mat[i][j] = sc.nextByte();

            }
        }

        System.out.println("Before swap");
        for(int[] i : mat){
            for(int j : i) System.out.print(j + " ");
            System.out.println();
        }

        System.out.print("Enter Column 1 : ");
        int col1 = sc.nextByte();

        System.out.print("Enter Column 2 : ");

        int col2 = sc.nextByte();

        for(int i = 0; i < 4; i++) mat[i][col1] += mat[i][col2] - (mat[i][col2] = mat[i][col1]);

        System.out.println("After swap");
        for(int[] i : mat){
            for(int j : i) System.out.print(j + " ");
            System.out.println();
        }

    }
}
