package Lab4;

import Lab3.CaesarCipherEncrytption;

public class TestMyArrays {
    public static void main(String[] args) {

        // Test 1 Valid Arguments.
        int currentSize1 = MyArrays.insert(new int[10], 9, 3, 1);
        System.out.println(("Expected: 10 \nActual: " + currentSize1));

        // Test 2 Full Array. Current Size not less than the array size.
        int currentSize2 = MyArrays.insert(new int[8], 8, 7, 5);
        System.out.println(("\nExpected: Error - Current Size must be less than the array Length \nActual: " + currentSize2));

        // Test 3 Position greater than the current size.
        int currentSize3 = MyArrays.insert(new int[2], 1, 3, 3);
        System.out.println(("\nExpected: Error - Integer is out of range \nActual: " + currentSize3));
    }
}
