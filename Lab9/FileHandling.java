package Lab9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\joseph\\Downloads\\hamlet.txt";

        Set<String> hamlet = new TreeSet<String>();
        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 1;
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next();
                    hamlet.add(word);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        for (String words: hamlet)
        {
            System.out.println(words);
        }

        if(hamlet.contains("slings"))
        {
            System.out.println("\nSlings is in the text");
        }

        System.out.println("\nSize of tree set is " + hamlet.size() + ".");
    }
}

