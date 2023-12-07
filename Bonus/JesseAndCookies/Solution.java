package Bonus.JesseAndCookies;

import java.io.*;

import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result {


    static class CustomPriorityQueue {
        private List<Integer> elements;

        public CustomPriorityQueue() {
            elements = new ArrayList<>();
        }

        public void add(int element) {
            elements.add(element);

            heapifyUp();
        }

        public int peek() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return elements.get(0);
        }

        public int remove() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }

            int root = elements.get(0);
            int removeNum = elements.remove(elements.size() - 1);
            if (!isEmpty()) {
                elements.set(0, removeNum);
                heapifyDown();
            }
            return root;
        }

        public boolean isEmpty() {
            return elements.isEmpty();
        }

        private void heapifyUp() {
            int index = elements.size() - 1;
            while (index > 0) {
                int parentIndex = (index - 1) / 2;
                if (elements.get(index) < elements.get(parentIndex)) {
                    swap(index, parentIndex);
                    index = parentIndex;
                } else {
                    break;
                }
            }
        }

        private void heapifyDown() {
            int index = 0;
            while (index < elements.size()) {
                int leftChildIndex = 2 * index + 1;
                int rightChildIndex = 2 * index + 2;
                int smallest = index;

                if (leftChildIndex < elements.size() && elements.get(leftChildIndex) < elements.get(smallest)) {
                    smallest = leftChildIndex;
                }

                if (rightChildIndex < elements.size() && elements.get(rightChildIndex) < elements.get(smallest)) {
                    smallest = rightChildIndex;
                }

                if (smallest != index) {
                    swap(index, smallest);
                    index = smallest;
                } else {
                    break;
                }
            }
        }

        private void swap(int i, int j) {
            int temp = elements.get(i);
            elements.set(i, elements.get(j));
            elements.set(j, temp);
        }

        public int size() {
            return elements.size();
        }
    }

    public static int cookies(int k, List<Integer> A) {
        int ans = 0;
        CustomPriorityQueue pqueue = new CustomPriorityQueue();
        for (Integer x : A) {
            pqueue.add((int) x);
        }
        while (pqueue.size() >= 2 && pqueue.peek() < k) {
            pqueue.add(pqueue.remove() + 2 * pqueue.remove());
            ans++;
        }
        return (pqueue.peek() < k) ? -1 : ans;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


