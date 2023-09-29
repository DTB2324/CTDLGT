
//
//import edu.princeton.cs.algs4.In;
//import edu.princeton.cs.algs4.StdOut;
//
//public class Stopwatch {
//    private final long start;
//    public Stopwatch() {
//        start = System.currentTimeMillis();
//    }
//    public double elapsedTime() {
//        long now = System.currentTimeMillis();
//        return (now - start) / 1000.0;
//    }
//    public static void main(String[] args) {
//        int[] a = In.readInts(args[0]);
//        Stopwatch stopwatch = new Stopwatch();
//        StdOut.println(ThreeSum.count(a));
//        double time = stopwatch.elapsedTime();
//        StdOut.println(time);
//    }
//}