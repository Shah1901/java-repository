import java.util.Scanner;
public class AddArray1 {
    public static void main(String[] args) {
        int a[] = new int[5], sum = 0;
        Scanner ed = new Scanner(System.in);
        System.out.println("Enter the elements :");
        for(int i=0; i<a.length; i++){
            a[i] = ed.nextInt();}
            System.out.println("Array Elements are :");
            for(int i=0; i<a.length; i++){
                System.out.println(a[i] + " ");
                sum = a[i] + sum;
            }
        System.out.println("Addition of elemets are : " + sum);
        ed.close();
    }
}
