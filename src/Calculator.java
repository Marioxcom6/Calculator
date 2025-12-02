public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int exponent(int a, int b) {
        return (int) Math.pow(a, b);
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.add(10, 5));
        System.out.println("Subtraction: " + calculator.subtract(10, 5));
        System.out.println("Multiply: " + calculator.multiply(10,5));
        try {
            System.out.println("Divide: " + calculator.divide(10,0));
        } catch (ArithmeticException e) {
            System.out.println("Divide: " + 0);
        }
        System.out.println("Exponent: " + calculator.exponent(10,2));
    }
}
