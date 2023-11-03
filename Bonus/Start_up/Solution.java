package Bonus.Start_up;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int event, amount = 0, marry, num = 0;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < N; i++) {
            event = sc.nextInt();
            if (event == 1) {
                maxPQ.add(sc.nextInt());
            } else if (event == 2) {
                marry = sc.nextInt();
                if(i < N - 1) {
                    if (marry > num) {
                        for (int j = 0; j < marry - 1; j++) {
                            amount += maxPQ.poll();
                            num++;
                        }
                    }
                    else {
                        System.out.println(-1);
                        amount = -1;
                    }
                } else {
                    if (marry >= num) {
                        for (int j = 0; j < marry - 1; j++) {
                            amount += maxPQ.poll();
                            num++;
                        }
                    }
                    else {
                        System.out.println(-1);
                        amount = -1;
                    }
                }
            }
        }
    }
}
