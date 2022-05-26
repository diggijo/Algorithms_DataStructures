package Lab1.Q4;

import Lab1.Q3.Q3;

public class TestQ4 {
    public static void main(String[] args) {
        // Test Case 1: Causeway1 - valid password
        boolean password1 = Q4.isValid("Causeway1");
        System.out.println("Expected: True" + " Actual: " + password1);

        // Test Case 2: hello12345 - no uppercase
        boolean password2 = Q4.isValid("hello12345");
        System.out.println("Expected: False" + " Actual: " + password2);

        // Test Case 3: Causeway - no digit
        boolean password3 = Q4.isValid("Causeway");
        System.out.println("Expected: False" + " Actual: " + password3);

        // Test Case 4: CAUSEWAY1 - no lowercase
        boolean password4 = Q4.isValid("CAUSEWAY1");
        System.out.println("Expected: False" + " Actual: " + password4);

        // Test Case 5: hello - less than 8
        boolean password5 = Q4.isValid("hello");
        System.out.println("Expected: False" + " Actual: " + password5);

        // Test Case 6: Diggins1 - Boundary Case - 8 characters, 1 Upper & 1 Digit
        boolean password6 = Q4.isValid("Diggins1");
        System.out.println("Expected: True" + " Actual: " + password6);
    }
}
