package tests;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] list = Arrays.stream(sc.next().split(",")).mapToInt(Integer::parseInt).toArray();

        int maxPos = 0, minPos = 0;

        for(int i = 0; i < list.length; i++) {
            maxPos = list[i] > list[maxPos] ? i : maxPos;
            minPos = list[i] < list[minPos] ? i : minPos;
        }

        list[0] += list[minPos] - (list[minPos] = list[0]);
        list[list.length-1] += list[maxPos] - (list[maxPos] = list[list.length-1]);

        for(int i : list) {
            System.out.print(i + " ");
        }

    }

}

/*
*
        var arr = new ArrayList<>(Arrays.stream(sc.next().split(",")).map(Integer::parseInt).toList());

        int max = arr.stream().max(Integer::compare).orElse(0);
        int min = arr.stream().min(Integer::compare).orElse(0);

        arr.remove(max);
        arr.remove(min);

        arr.addFirst(min);
        arr.addLast(max);

        System.out.println(arr);
* */