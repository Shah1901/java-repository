import java.util.Scanner;
public class Relational {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter two numbers : ");
        Scanner obj = new Scanner(System.in);

        a = obj.nextInt();
        b = obj.nextInt();

        System.out.println("True/False " + (a>b));
        System.out.println("True/False " + (a<b));
        System.out.println("True/False " + (a>=b));
        System.out.println("True/False " + (a<=b));
        System.out.println("True/False " + (a==b));
        System.out.println("True/False " + (a!=b));

        obj.close();
    }
}
