class NewCons {
    int a; 
    String name;
    NewCons() {
        a=0;
        name= null;
    }
    void show()
    {
        System.out.println(a+ " " +name);
    }
}
public class Simp_cons {
    public static void main(String[] args) {
        NewCons ref = new NewCons();
        ref.show();
    }
}
