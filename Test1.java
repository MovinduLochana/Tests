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

        // finding max and min index positions
        for(int i = 0; i < list.length; i++) {
            maxPos = list[i] > list[maxPos] ? i : maxPos;
            minPos = list[i] < list[minPos] ? i : minPos;
        }

        // Swapping without the need of a temporary variable
        // variable a, b => a = b + a - (b = a)

        // swapping index 0 value with min value
        list[0] += list[minPos] - (list[minPos] = list[0]);

        // swapping last index value with max value
        list[list.length-1] += list[maxPos] - (list[maxPos] = list[list.length-1]);

        // printing final array
        for(int i : list) {
            System.out.print(i + " ");
        }

    }

}

// Declarative way of doing the same task
/*
*
        Example 01
        ========================================================================================================
        
        var arr = new ArrayList<>(Arrays.stream(sc.next().split(",")).map(Integer::parseInt).toList());

        int max = arr.stream().max(Integer::compare).orElse(0);
        int min = arr.stream().min(Integer::compare).orElse(0);

        arr.remove(max);
        arr.remove(min);

        // Implemented in Java 21
        arr.addFirst(min);
        arr.addLast(max);

        System.out.println(arr);




        Example 02
        ==========================================================================================================
        
        var stats = Arrays.stream(new Scanner(System.in).next().split(","))
                          .mapToInt(Integer::parseInt)
                          .summaryStatistics();
      
        int max = stats.getMax();
        int min = stats.getMin();
* */
