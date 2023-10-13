package Week1_2;

import java.util.ArrayList;
import java.util.Scanner;

public class nSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        ArrayList<Integer> v = new ArrayList<Integer>();
        v.add(0);
        for(int i = 0; i < n; i++){
            int l = v.size();
            for(int j = 0; j < l; j++){
                v.add(input[i] + v.get(j));
            }
            for(int j = 0; j < v.size(); j++){
                System.out.print(v.get(j) + " ");
            }
            System.out.println();
        }
    }
}
