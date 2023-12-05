package Bonus.Queries2;

import java.util.Scanner;

public class Solution {
    private static int n;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] a = new int[n + 5];
        int[] ST = new int[4 * n + 5];
        for (int i = 1; i <= n; i++) {
            a[i] = scanner.nextInt();
        }
        build(ST, a, 1, 1, n);
        int k = scanner.nextInt();
        for (int i = 0; i < k; i++) {
            int query = scanner.nextInt();
            if (query == 1) {
                int l = scanner.nextInt();
                int r = scanner.nextInt();
                System.out.println(get(ST, a, 1, 1, n, l, r));
            } else if (query == 2) {
                int id = scanner.nextInt();
                int v = scanner.nextInt();
                update(ST, 1, id, v, 1, n);
            }
        }
    }

    public static void build(int[] ST, int[] a, int id, int l, int r) {
        if (l == r) {
            ST[id] = a[l];
            return;
        }
        int mid = (l + r) / 2;
        build(ST, a, id * 2, l, mid);
        build(ST, a, id * 2 + 1, mid + 1, r);
        ST[id] = Math.min(ST[id * 2], ST[id * 2 + 1]);
    }

    public static long get(int[] ST, int[] a, int id, int l, int r, int u, int v) {
        if (v < l || r < u) {
            return Long.MAX_VALUE;
        }
        if (u <= l && r <= v) {
            return ST[id];
        }
        int mid = (l + r) / 2;
        return Math.min(get(ST, a, id * 2, l, mid, u, v), get(ST, a, id * 2 + 1, mid + 1, r, u, v));
    }

    public static void update(int[] ST, int id, int i, int v, int l, int r) {
        if (i < l || i > r) {
            return;
        }
        if (l == r) {
            ST[id] = v;
            return;
        }

        int mid = (l + r) / 2;
        update(ST, id * 2, i,  v, l, mid);
        update(ST, id * 2 + 1, i, v, mid + 1, r);

        ST[id] = Math.min(ST[id*2], ST[id*2 + 1]);

    }
}
