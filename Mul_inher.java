class A {
int a, b, c;
void Add(){
    a=10; b=20;
    c=a+b;
    System.out.println("Sum of two numbers : " +c);
}
void Sub(){
    a=100; b=20;
    c=a-b;
    System.out.println("Sub of two numbers : " +c);
}
}
class B extends A {

void Mul() {
    a=10; b=20;
    c=a*b;
    System.out.println("Mul of two numbers : " +c);
}

void div() {
    a=100; b=20;
    c=a/b;
    System.out.println("div of two numbers : " +c);
}
}
class C extends B {
    void remainder() {
    a=100; b=20;
    c=a%b;
    System.out.println("remainder of two numbers : " +c);
}
}
public class Mul_inher {
public static void main(String[] args) {
    C r= new C();
    r.Add(); r.Sub(); r.Mul(); r.div(); r.remainder();
}
}