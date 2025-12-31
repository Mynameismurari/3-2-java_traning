public class FactorialDemo {
    int factorial(int n) {
        int fact = 1;
        for(int i=1; i<=n; i++) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        FactorialDemo obj = new FactorialDemo();
        System.out.println("Factorial of 5: " + obj.factorial(5));
    }
}