import edu.princeton.cs.algs4.*;

public class ReadFile {
    public static void main(String[] args) {
        In in = new In("D:\\CTDLGT\\algs4-data\\algs4-data\\1Mints.txt"); // tạo luồng đọc từ file
        while(!in.isEmpty()){
            int a = in.readInt();  // đọc toàn bộ file vào mảng a
//        for(int i = 0; i < a.length; i++){
//            System.out.println(a[i]);
//        }
            System.out.println(a);
        }
    }
}
