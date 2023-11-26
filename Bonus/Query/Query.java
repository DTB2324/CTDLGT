package Bonus.Query;

import java.util.Scanner;

public class Query {
    private static int n;
    private static int a[] = new int[n];
    private static int ST[] = new int[4 * n];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = in.nextInt();
        }
        build(1, 1, n);
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            System.out.println(get(1, 1, n, l, r));
        }
    }

    public static void build(int id, int l, int r) {
        if (l == r) {
            ST[id] = a[l];
            return;
        }
        int mid = (l + r) / 2;
        build(id*2, l, mid);
        build(id*2 + 1, mid+1, r);
        ST[id] = Math.max(ST[id*2], ST[id*2 + 1]);
    }

    private static int get(int id, int l, int r, int u, int v) {
        if (v < l || r < u) {
            return -1;
        }
        if (u <= l && r <= v) {
            return ST[id];
        }
        int mid = (l + r) / 2;
        return Math.max(get(id*2, l, mid, u, v), get(id*2 + 1, mid+1, r, u, v));
    }
}
