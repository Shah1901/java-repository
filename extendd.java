abstract class Shape {
    double dim1;
    double dim2;
abstract void area() ;
    Shape( double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}
public class extendd {
    public static void main(String[] args) {
        rectangle r1 = new rectangle(4, 8) ;
        r1.area () ;
        triangle r2 = new triangle(4, 8) ;
        r2.area();
        circle r3 = new circle(4, 8) ;
        r3.area();
    }
}
class rectangle extends Shape {
    rectangle (double dim1 , double dim2) {
        super(dim1, dim2); }
        void area () {
            double area = dim1*dim2;
            System.out.println(area);
        }
    }
class triangle extends Shape {
    triangle (double dim1 , double dim2) {
    super(dim1, dim2); }
    void area () {
        double area = 0.5*dim1*dim2 ;
        System.out.println(area);
    }
}
class circle extends Shape {
    circle (double dim1 , double dim2) {
        super( dim1, dim2); }
        void area () {
            double area = 3.14*dim1*dim1;
            System.out.println(area);
        }
}