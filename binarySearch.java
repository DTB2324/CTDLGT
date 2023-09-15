import edu.princeton.cs.algs4.*;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
    public static int binarySearch(int[] a, int number){
        int n = a.length;
        int l = 0;
        int r = n-1;
        int m;
        while (l <= r) {
            m = r - (r - l)/2;
            if(a[m] == number)  return m;
            else    if(a[m] > number)   r = m -1;
            else l = m + 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        In in = new In("D:\\CTDLGT\\algs4-data\\algs4-data\\1Kints.txt");
        int[] a = in.readAllInts();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Arrays.sort(a);
        for(int i = 0; i < a.length; i++){
            System.out.println(i + ". " + a[i]);
        }
        System.out.println(binarySearch(a, number));
    }
}
