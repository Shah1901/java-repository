// public class Variable {
//     static int a = 20;    // Static variable
//     int b = 10;  // Instance variable 
// public static void main(String[] args) {
//     int c = 30;     // Local variable

//         Variable ref=new Variable();
        
//     System.out.println(c);
//     System.out.println(Variable.a);
//     System.out.println(ref.b);
// }
// }
public class Variable {
        static int a=10;
        void fun()
        {
            int b = 10;
            System.out.println(a + " " + b);  // 10       10
            ++a; ++b;
        }
        public static void main(String[] args) {
            Variable ref = new Variable();
            ref.fun();
            ref.fun();
        }
}
