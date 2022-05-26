package Lab1.Q1;

import javax.swing.*;

public class Q1 {
    public static void main(String[] args) {
        String text="";

        text += "The smallest number is: " + smallest(2, 44, 4);

        text += "\n\nFive to the power of Six is: " + power(5,6);

        text += "\n\nThe sum of numbers from 1 to 10 is: " + sum(10);

        text += "\n\nThe factorial of Five is: " + factorial(5);

        text += "\n\nCheck if a number is a prime number: " + isPrime(8);

        JOptionPane.showMessageDialog(null, text, "Test Methods", JOptionPane.INFORMATION_MESSAGE);
    }

    private static boolean isPrime(int a)
    {
        int divisors = 0;

        for(int i=1; i<=a; i++)
        {
            if(a%i == 0)
                divisors++;
        }

        if(divisors==2)
            return true;

        else
            return false;
    }

    private static int factorial(int a)
    {
        int total=1;

        for(int i=1; i<=a; i++)
        {
            total = total*i;
        }

        return total;
    }

    public static int smallest(int a, int b, int c)
    {
        int smallest = a;

        if(b<a)
        {
            smallest=b;
        }

        if(c<b)
        {
            smallest=c;
        }

        if(a<c)
        {
            smallest=a;
        }

        return smallest;
    }

    public static int power(int a, int b)
    {
        int total = a;

        for(int i=1; i<b; i++) {
           total = total*a;
        }

        return total;
    }

    public static int sum(int a)
    {
        int total=0;

        for(int i = 0; i<=a; i++)
            total += i;

        return total;
    }
}
