import edu.princeton.cs.algs4.StdIn;

public class UFCilent2 {
    public static int cnt, pos;
    public static void main(String[] args) {
        int N = StdIn.readInt();
        WeightedQuickUnion uf = new WeightedQuickUnion(N);
        while(!StdIn.isEmpty()){
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if(cnt < N-1)   pos++;
            if(!uf.connected(p, q)){
                uf.union(p, q);
                cnt++;
            }
        }
        if(cnt == N-1)  System.out.println(pos);
        else System.out.println("FAILED");
    }
}
