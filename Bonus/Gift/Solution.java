package Bonus.Gift;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        long ans = a[0];
        minPQ.add(a[0]);
        System.out.print(ans + " ");
        for(int i = 1; i < n; i++) {
            if(i < k) {
                ans += a[i];
                minPQ.add(a[i]);
            } else {
                if(a[i] > minPQ.peek()) {
                    ans = ans - minPQ.poll() + a[i];
                    minPQ.add(a[i]);
                }
            }
            System.out.print(ans + " ");
        }
    }
}
