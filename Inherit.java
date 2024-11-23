public class Inherit {
    int toll;
    int marks;
    String name;
    void input() {
        System.out.println("Enter roll, name and marks");
    }
}
    class ayaan extends Inherit {
        public static ayaan b;
        void Disp() {
            toll=1; name="Shah"; marks=99;
            System.out.println(toll+ "\n" +name+ "\n" +marks);
        }
        public static void main(String[] args) {
            ayaan.b=new ayaan();
            b.input(); b.Disp();
        }
    }


