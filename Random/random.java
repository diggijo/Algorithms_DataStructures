package Random;

public class random {
    public static void main(String[] args) {
        String text = "Hello World News!";

        String noSpaces = removeSpaces(text);

        System.out.println(noSpaces);
    }

    public static String removeSpaces(String plaintext)
    {
        StringBuilder newPlainText = new StringBuilder("");

        for(int i=0; i < plaintext.length(); i++)
        {
            char ch = plaintext.charAt(i);

            if(ch != (' '))
            {
                newPlainText.append(ch);
            }
        }

        return newPlainText.toString();
    }
}