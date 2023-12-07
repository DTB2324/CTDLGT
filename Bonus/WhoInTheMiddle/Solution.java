package Bonus.WhoInTheMiddle;

import java.util.*;


public class Solution {

    public static void update(PriorityQueue<Long> maxPQ, PriorityQueue<Long> minPQ) {
        if (maxPQ.size() > minPQ.size() + 1) {
            minPQ.add(maxPQ.poll());
        } else if (maxPQ.size() < minPQ.size()) {
            maxPQ.add(minPQ.poll());
        }
    }

    public static void add(PriorityQueue<Long> maxPQ, PriorityQueue<Long> minPQ, long a) {
        if (maxPQ.isEmpty() || maxPQ.peek() >= a) {
            maxPQ.add(a);
        } else {
            minPQ.add(a);
        }
        update(maxPQ, minPQ);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        PriorityQueue<Long> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Long> minPQ = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            add(maxPQ, minPQ, num);
        }

        int event;
        long height;
        for (int i = 0; i < m; i++) {
            event = scanner.nextInt();
            if (event == 1) {
                height = scanner.nextInt();
                add(maxPQ, minPQ, height);
            } else if (event == 2) {
                maxPQ.poll();
                update(maxPQ, minPQ);
            } else if (event == 3) {
                System.out.println(maxPQ.isEmpty() ? 0 :maxPQ.peek());
            }
        }
    }
}