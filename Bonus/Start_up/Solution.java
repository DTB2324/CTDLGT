package Bonus.Start_up;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long amount = 0;
        int event, marry;
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer, Integer> map = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            event = sc.nextInt();
            if (event == 1) {
                int addNum = sc.nextInt();
                maxPQ.add(addNum);
                map.put(addNum, i + 1);
            } else if (event == 2) {
                marry = sc.nextInt();

                if (i < N - 1) {
                    if (marry <= queue.size()) {
                        System.out.println(-1);
                        return;
                    } else {
                        for (int j = queue.size(); j < marry - 1; j++) {
                            int addNum = maxPQ.poll();
                            queue.add(map.get(addNum));
                            amount += addNum;
                        }
                    }
                    map.clear();
                    maxPQ.clear();
                } else {
                    if (marry > maxPQ.size() + queue.size()) {
                        System.out.println(-1);
                        return;
                    } else {
                        for (int j = queue.size(); j < marry; j++) {
                            int addNum = maxPQ.poll();
                            queue.add(map.get(addNum));
                            amount += addNum;
                        }
                    }
                }
            }
        }
        System.out.println(amount);
        for (int x : queue) {
            System.out.print(x + " ");
        }
    }
}
