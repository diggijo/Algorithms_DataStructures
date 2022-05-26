package Lab5;

public class Factorial {
    public static void main(String[] args) {
        // Test 1: 5
        System.out.println("Testing 5:  Expected: 120, Actual: " + Factorial.factorial(5));

        // Test 2: 0
        System.out.println("Testing 0:  Expected: 1, Actual: " + Factorial.factorial(0));

        // Test 3: 10
        System.out.println("Testing 0:  Expected: 3628800, Actual: " + Factorial.factorial(10));
    }

    public static int factorial(int n)
    {
        if ( n == 1 || n == 0 )  // base case
            return 1;
        else
        {
            int result1 = factorial(n-1);
            int result = n * result1;
            return result;
        }
    }
}
