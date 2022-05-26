package Lab1.Q3;

import javax.swing.*;

public class Q3 {
    public static void main(String[] args) {
        String input="";

        input = JOptionPane.showInputDialog("Please enter a sentence: ");

        JOptionPane.showMessageDialog(null, countWords(input), "Word Count", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int countWords(String str)
    {
        int wordCount=1;

        for(int i=0; i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                wordCount++;
        }
        return wordCount;
    }
}
