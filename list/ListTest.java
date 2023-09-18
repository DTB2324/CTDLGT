package list;
public class ListTest {
    public static void main(String[] args) {
        MyList list = new MyList();
        list.append("Bình chu du");
        System.out.println(list);
        list.addFirst("aka");
        System.out.println(list);
        list.addFirst("Pòm Pom");
        System.out.println(list);
        list.append("aka Đỗ Trọng Bình");
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
