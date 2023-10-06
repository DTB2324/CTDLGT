package Sort;

import edu.princeton.cs.algs4.In;

public class InsertionSort {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        In input = new In("D:\\CTDLGT\\algs4-data\\algs4-data\\8ints.txt");
        int[] a = input.readAllInts();
        System.out.print(0 + "> ");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("");
        for(int i = 0; i < a.length; i++) {
            for(int j = i; j > 0; j--) {
                if(a[j] < a[j-1]) {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else break;
            }
            System.out.print(i+1 + "> ");
            for(int z = 0; z < a.length; z++) {
                System.out.print(a[z] + " ");
            }
            System.out.println("");
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
    }
}
