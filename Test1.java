package tests;

import java.util.Arrays;
import java.util.Scanner;

/*
Answer to Q2 Part I
*/

public class Test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input string => sperate by (,) => String Array => convert all to Int Array
        int[] list = Arrays.stream(sc.next().split(",")).mapToInt(Integer::parseInt).toArray();

        int maxPos = 0, minPos = 0;

        for(int i = 0; i < list.length; i++) {
            maxPos = list[i] > list[maxPos] ? i : maxPos;
            minPos = list[i] < list[minPos] ? i : minPos;
        }

        // swapping variables without the need of a temporary variable
        list[0] += list[minPos] - (list[minPos] = list[0]);
        list[list.length-1] += list[maxPos] - (list[maxPos] = list[list.length-1]);

        for(int i : list) {
            System.out.print(i + " ");
        }

    }

}

// Declarative way of doing the same task
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
