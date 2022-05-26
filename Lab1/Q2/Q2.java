package Lab1.Q2;

import javax.swing.*;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        int number;
        String text="";

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        do {
            number = (Integer.parseInt(JOptionPane.showInputDialog("Please enter a number between 1 & 100 (<1 to exit)")));
            if(number >= 1)
            {
                numbers.add(number);
            }
        }while(number >= 1);

        Set<Integer> i = new HashSet<Integer>(numbers);
        for (Integer num : i)
            System.out.println(num + ": " + Collections.frequency(numbers, num));
    }
}
