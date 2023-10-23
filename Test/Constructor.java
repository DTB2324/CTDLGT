package Test;

class Student {
    boolean id;
    String name;
    void display() {
        System.out.println(id + " " + name);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
