package Lab5;

public class Power {
    public static void main(String[] args) {
        // Test 1: To the power of 0
        System.out.println("Testing x^0:  Expected: 1.0, Actual: " + Power.myPow(3,0));

        // Test 2: To the power of 1
        System.out.println("Testing x^1:  Expected: 3.0, Actual: " + Power.myPow(3,1));

        // Test 3: 2 to the power of 4
        System.out.println("Testing 2^4:  Expected: 16.0, Actual: " + Power.myPow(2,4));

        // Test 3: 1.5 to the power of 2
        System.out.println("Testing 1.5^2:  Expected: 2.25, Actual: " + Power.myPow(1.5,2));
    }

    public static double myPow(double x, int y)
    {

        double result, result1;

        if(y==0)
            return 1;
        else if(y==1)
            return x;
        else
            result1 = myPow(x, y-1);
            result = x * result1;
            return result;
    }
}
