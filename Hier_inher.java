class A {
    void fun()
    {
        System.out.println("Enter your Name : ");
    }
}
class B extends A {
    void demo()
    {
        System.out.println("My Name is Shah ");
    }
}
class C extends A {
    
    void disp()
    {
        System.out.println("My name is Arsalan ");
    }

    @Override
    public String toString() {
        return "C []";
    }
}
public class Hier_inher {
    public static void main(String[] args) {
        B r = new B(); 
        C r2 = new C();
        r.fun(); r.demo();
        r2.fun(); r2.disp();
    }
}
