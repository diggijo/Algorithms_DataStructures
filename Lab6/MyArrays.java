package Lab6;

public class MyArrays {
    public static void selectionSort(int[] a)
    {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++)
        {
            //find index such that a[index] is the smallest of a[i]..a[a.length-1]
            int index = i;
            int smallest = a[i];

            for (int j = i + 1; j <= a.length - 1; j++)
            {
                if (a[j] < smallest)
                {
                    smallest = a[j];
                    index = j;
                }
            }

            //if index != i, swap a[index] and a[i].
            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;
            }
        }
    }

    public static void insertionSort(int[] a)
    {
        for(int i=1; i<a.length; i++)
        {
            int val = a[i];
            int j = i-1;

            while(j>=0 && a[j] > val)
            {
                a[j+1] = a[j];
                j--;
            }

            a[j+1] = val;
        }
    }

    public static int binarySearch(int[] a, int key)
    {
        int l = 0;
        int r = a.length-1;

        boolean found = false;

        while(!found && l<=r)
        {
             int m = l + (r-l)/2;

            if(key == a[m])
            {
                found = true;
                return m;
            }
            else if(key < a[m])
            {
                r = m-1;
            }
            else
            {
                l = m+1;
            }
        }

        return -1;
    }

    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void mergeSort(int[] a)
    {
        if(a.length <= 1)
        {
            return;
        }

        int[] first = new int[a.length/2];
        int[] second = new int[a.length - first.length];

        for (int i = 0; i < first.length; i++)
        {
            first[i] = a[i];
        }

        for (int j = 0; j < second.length; j++)
        {
            second[j] = a[first.length+j];
        }

        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }

    public static void merge(int[] first, int[] second, int[] a)
    {
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while(iFirst < first.length && iSecond < second.length)
        {
            if(first[iFirst] < second[iSecond])
            {
                a[j] = first[iFirst];
                iFirst++;
            }
            else
            {
                a[j] = second[iSecond];
                iSecond++;
            }

            j++;
        }

        while(iFirst<first.length)
        {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }

        while(iSecond<second.length)
        {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}
