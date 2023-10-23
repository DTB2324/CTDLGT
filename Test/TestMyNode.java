package Test;

import java.util.Scanner;

public class TestMyNode {
    public static void main(String[] args) {
        MyNode head = new MyNode();
        MyNode newNode = head;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            newNode.next = new MyNode();
            newNode = newNode.next;
            newNode.data = i + 1;
        }
        head = head.next;
        while(head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}
