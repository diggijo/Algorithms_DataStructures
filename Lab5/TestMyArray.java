package Lab5;

public class TestMyArray {
    public static void main(String[] args) {
        //Test 1: Five elements in the Array
        int[] array1 = {1,2,3,4,5};
        System.out.println("Test 1 Array{1,2,3,4,5}: \nExepcted : 15, Actual: " + MyArrays.sum(array1));

        //Test 2: One Element in the Array
        int[] array2 = {1};
        System.out.println("\nTest 2 Array{1}: \nExepcted : 1, Actual: " + MyArrays.sum(array2));

        //Test 3: No Elements in the Array
        int[] array3 = {};
        System.out.println("\nTest 2 Array{1}: \nExepcted : 0, Actual: " + MyArrays.sum(array3));
    }
}
