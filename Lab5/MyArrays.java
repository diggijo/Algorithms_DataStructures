package Lab5;

import java.util.Arrays;

public class MyArrays {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println(sum(values));
    }

    public static int sum(int [] values)
    {
        if(values.length==1)
            return values[0];
        else if(values.length==0)
            return 0;
        else
            return values[values.length-1] + sum(Arrays.copyOf(values, values.length-1));
    }
}
