class Student {
    String name;
    int age;

public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);

}

Student(String name, int age) {
    this.name = name;
    this.age = age;
    System.out.println("hello");
}   
}
public class Cons {
    public static void main(String[] args) {
        Student s1 = new Student("shah", 20);
        s1.printInfo();
    }
}
