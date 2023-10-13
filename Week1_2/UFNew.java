package Week1_2;

public class UFNew {
    private int[] id;
    private int[] sz;
    public UFNew(int N){
        id = new int[N];
        sz = new int[N];
        for(int i = 0; i < N; i++){
            id[i] = -1;
            sz[i] = 1;
        }
    }
    public int getRoot(int x){
        if(id[x] < 0)   return x;
        return id[x] = getRoot(id[x]);
    }

    public void union(int x, int y){
        if(getRoot(x) < getRoot(y)){
            sz[y]+= sz[x];
            id[x] = getRoot(y);
            id[getRoot(y)] = -sz[y];
        }
        if(getRoot(x) > getRoot(y)){
            sz[x]+=sz[y];
            id[y] = getRoot(x);
            id[getRoot(x)] = -sz[x];
        }
    }

    public boolean connected(int x, int y) {
        return getRoot(x) == getRoot(y);
    }
}
