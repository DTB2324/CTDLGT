//import edu.princeton.cs.algs4.*;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class binarySearch {
//    public static int binarySearch(int[] a, int number){
//        int n = a.length;
//        int l = 0;
//        int r = n-1;
//        int m;
//        while (l <= r) {
//            m = r - (r - l)/2;
//            if(a[m] == number)  return m;
//            else    if(a[m] > number)   r = m -1;
//            else l = m + 1;
//        }
//        return -1;
//    }
