package Lab4;

import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
        int[] values = new int[10];
        int currentSize=0;
        int pos=5;
        int newElement=17;
        Scanner s = new Scanner(System.in);

        while(currentSize<values.length-1)
        {
            System.out.print("Enter the next element in the array: ");
            values[currentSize] = s.nextInt();
            currentSize++;
        }

        System.out.print("\n\nThe current size of the array is: " + insert(values, currentSize, pos, newElement));
        System.out.println(("\n\n" + Arrays.toString(values)));
    }

    public static int insert(int[] values, int currentSize, int pos, int newElement)
    {
        if(pos>=0 && pos<currentSize)
        {
            if(currentSize<values.length)
            {
                for(int i=currentSize-1; i>=pos; i--)
                {
                    values[i+1] = values[i];
                }
                values[pos] = newElement;
                currentSize++;
            }
            else
            {
                throw new IndexOutOfBoundsException("Current Size must be less than the array Length");
            }
        }
        else
        {
            throw new NumberFormatException("Integer is out of range");
        }

        return currentSize;
    }
}
