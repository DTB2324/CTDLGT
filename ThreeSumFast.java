import edu.princeton.cs.algs4.*;

import java.util.Arrays;

public class ThreeSumFast {
    public static void main(String[] args) {
        In in = new In("D:\\CTDLGT\\algs4-data\\algs4-data\\16Kints.txt");
        int[] a = in.readAllInts();
        int ans = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int k = Arrays.binarySearch(a, -(a[i] + a[j]));
                if(k > j){
                    System.out.println(++ans + ". " + a[i] + " + " + a[j] + " + " + a[k] + " = 0");
                }
            }
        }
    }
}