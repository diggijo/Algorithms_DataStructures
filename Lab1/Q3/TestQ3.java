package Lab1.Q3;

public class TestQ3 {
    public static void main(String[] args) {

        // Test Case 1: A Star Is Born
        int words1 = Q3.countWords("A Star Is Born");
        System.out.println(("Expected: " + 4 + " Actual: " + words1));

        // Test Case 2: Willy Wonka and the chocolate Factory
        int words2 = Q3.countWords("Willy Wonka and the chocolate Factory");
        System.out.println(("Expected: " + 6 + " Actual: " + words2));

        // Test Case 3: Hello
        int words3 = Q3.countWords("Titanic");
        System.out.println(("Expected: " + 1 + " Actual: " + words3));
    }
}
