import java.util.Scanner;
public class Simple {
    
public static void main(String[] args) {
    
    int age;
    System.out.println("Enter your Age");
    Scanner obj = new Scanner(System.in);
    age=obj.nextInt();
    if(age>18) {
        System.out.println("You can Drive");
    }
    else{
        System.out.println("You cannot Drive yet");
    }
   obj.close();
}
}
