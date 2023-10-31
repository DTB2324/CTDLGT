package Bonus.JesseAndCookies;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static int sz;
    public static int a[];
    public static void add(int[] a, int sz, int x) {
        a[++sz] = x;
        int temp = sz;
        while(temp != 1) {
            int par = temp / 2;
            if(a[par] > a[temp]) {
                int y = a[temp];
                a[temp] = a[par];
                a[par] = y;
            } else {
                break;
            }
        }
    }

    public static void remove(int[] a, int sz) {
        a[1] = a[sz--];
        int temp = 1;
        while(temp <= sz) {
            int left = temp * 2;
            int right = left + 1;
            if(a[left] < a[right]) {
                if(a[left] < a[temp]) {
                    int y = a[temp];
                    a[temp] = a[left];
                    a[left] = y;
                    temp = left;
                }
            }
        }
    }

    /*
     * Complete the 'cookies' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     */

    public static int cookies(int k, List<Integer> A) {
        // Write your code here
        int ans = 0;
        PriorityQueue<Integer> pqueue = new PriorityQueue<>();
        for (Integer x : A) {
            pqueue.add((int) x);
        }
        while(!pqueue.isEmpty()) {
            if(pqueue.peek() <= k) {
                int rep = pqueue.remove();
                pqueue.add(rep + 2 * pqueue.remove());
                ans++;
            }
            else break;
        }
        return ans;
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


