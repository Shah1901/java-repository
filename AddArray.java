import java.util.Scanner;
public class AddArray {
    public static void main(String[] args) {
        
    
    int a[] = new int[5], sum = 0;
    System.out.println("Enter Elements of an Array : ");
    Scanner r = new Scanner(System.in);
    
    for(int i=0; i<a.length; i++){
        a[i] = r.nextInt();
    }
    System.out.println("Array Elements are : ");
    for( int i=0; i<a.length; i++){
        System.out.println(a[i] + " ");
        sum = a[i] + sum;
    }
    System.out.println("\n Additon of Array Elements are : " +sum);

    r.close();
}
}