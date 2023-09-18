import edu.princeton.cs.algs4.*;

public class ThreeSum {
    public static int count = 0;
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        System.out.println(count(a));
    }

    public static int count(int[] a) {
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                for(int k = j + 1; k < a.length; k++){
                    if(a[i] + a[j] + a[k] == 0){
                        System.out.println(++count + " " + a[i] + " + " + a[j] + " + " + a[k] + " = 0");
                    }
                }
            }
        }
        return count;
    }
}
