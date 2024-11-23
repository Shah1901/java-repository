// public class Array{
    //     public static void main(String[] args) {
    //         int a[] = new int[5];
    //         a[0] = 10;
    //         a[1] = 20;
    //         a[2] = 30;
    //         a[3] = 40;
    //         a[4] = 50;
    
    //         for(int i=0; i<5; i++){
    //             System.out.println(a[i]);
    //         }
           
    //     }
    // }
    import java.util.Scanner;
    public class Array{
        public static void main(String[] args) {
            
        int size, i;
        try (Scanner r = new Scanner(System.in)) {
            System.out.println("Enter the size of array ");
            size = r.nextInt();
            int a[] = new int [size];
   
            for (i=0; i<size; i++)
            {
                a[i] = r.nextInt();
            }
     
            System.out.println("Printed Array Elements ");
            for(i=0; i<size; i++)
            {
                System.out.println(a[i] + " ");
            } 
            r.close();
        }
    }
    }