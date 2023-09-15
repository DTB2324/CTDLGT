import edu.princeton.cs.algs4.*;

public class ThreeSum {
    public static void main(String[] args) {
        In in = new In("D:\\CTDLGT\\algs4-data\\algs4-data\\2Kints.txt");
        int[] a = in.readAllInts();
        int ans = 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                for(int k = j + 1; k < a.length; k++){
                    if(a[i] + a[j] + a[k] == 0){
                        System.out.println(++ans + " " + a[i] + " + " + a[j] + " + " + a[k] + " = 0");
                    }
                }
            }
        }
    }
}
