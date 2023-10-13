package Week1_2;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class threeSumF1 {

    public static void main(String[] args) {
        int count = 0;
        In in = new In("D:\\CTDLGT\\algs4-data\\algs4-data\\8Kints.txt");
        int[] a = in.readAllInts();
        int ans = 0;
        Arrays.sort(a);
        int n = a.length;
        for(int i = 0; i < n - 2; i++){
            int j = i + 1, k = n - 1;
            while(j < k){
                if(a[i] + a[j] + a[k] == 0){
                    System.out.println(++ans + ". " + a[i] + " + " + a[j] + " + " + a[k] + " = 0");
                    j++;
                    k--;
                }
                else if(a[i] + a[j] + a[k] > 0){
                    k--;
                }
                else j++;
            }
        }
    }
}


