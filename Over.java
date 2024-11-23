class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Over {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int intSum = math.add(5, 10);
        System.out.println("Sum of integers: " + intSum);

        double doubleSum = math.add(5.5, 10.5);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}
