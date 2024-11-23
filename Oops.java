class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
}

}

public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student();    // Student is constructer.
        s1.name = "Shah Arsalan";
        s1.age = 20;
            
        s1.printInfo();
    }
}