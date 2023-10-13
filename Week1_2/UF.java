package Week1_2;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class UF {
    public static void main(String[] args) {
        int N = StdIn.readInt();
        int ans = N;
        UFNew uf = new UFNew(N);
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(!uf.connected(p, q)){
                uf.union(p, q);
                ans--;
                StdOut.println(p + " " + q);
            }
        }
        StdOut.println(ans);
    }
}
