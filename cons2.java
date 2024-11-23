class Teacher {
    String name;
    String teaching;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.teaching);
        System.out.println(this.age);
    }
        Teacher (String name, String teaching, int age){
this.name = name;
this.teaching = teaching;
this.age = age;
        }
}
public class cons2 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher ("nowsheen", "DBMS", 28);
        // t1.name = "Nowsheen";
        // t1.teaching = "DBMS";
        // t1.age = 28;

        t1.printInfo();
    }
}
