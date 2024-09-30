import java.util.Arrays;

public class IT24100345Lab8Q2 {
    public static void main(String[] args) {

        int[] a = {10, 20, 30, 40, 50};
        System.out.println("A Content : " + Arrays.toString(a));

        int[] b = {34, 67, 12, 89, 12};
        System.out.println("B Content : " + Arrays.toString(b));

        int[] c = new int[a.length];

        for (int i = 0; i < a.length; i++) c[i] = a[i] + b[i];

        System.out.println("C Content (A + B) : " + Arrays.toString(c));


    }
}
