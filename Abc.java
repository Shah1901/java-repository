public class Abc {
   public static void main(String[] args) {
    int n1=0 , n2=1, n3=2, i, count=10;
    System.out.println(n1+ " " +n2+ " " +n1);
    for(i=2;i<count;i++){
        n3 = n2+n1;
    }
    System.out.println(" " +n3);
    n1 = n2;
    n2 = n3;
    System.out.println(n1+ " " +n2+ " " +n3);
   } 
}
