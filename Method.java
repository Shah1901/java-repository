public class Method {
    void Disp(){
        System.out.println("Hello Shah!");
    }
    void Add(){
        int a = 10, b = 10;
        System.out.println("Sum = " + (a+b));
    }
    public static void main(String[] args) {
        Method r = new Method();
        r.Disp();
        r.Add();
    }
}
