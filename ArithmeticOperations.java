// ArithmeticOperations.java
class arith {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
}
// Demo.java
public class ArithmeticOperations {
    
    // Defining constants
    public static final int NUM1 = 10;
    public static final int NUM2 = 5;

    public static void main(String[] args) {
        arith arithmetic = new arith();
        int a=10 , b=20;
        System.out.println("Addition: " + arith.add(a, b));
        System.out.println("Subtraction: " +arith.subtract(a, b) );
        System.out.println("Multiplication: " +arith.multiply(a, b));
        System.out.println("Division: " + arith.divide(a, b));
    }
}
