import java.util.Scanner;

public class input {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter your Name");

String name = scanner.nextLine();
System.out.println("Enter your age :");

int age = scanner.nextInt();

System.out.println("Hello , " + name + " You are " + age + " years old. ");

scanner .close();
}
} 