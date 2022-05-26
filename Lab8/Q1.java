package Lab8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Q1
{
    public static void main(String[] args)
    {
        LinkedList<String> names = new LinkedList<>();

        names.add("Jordan");
        names.add("Michael");
        names.add("Bernie");
        names.add("Keith");

        names.addFirst("Henry");
        names.addLast("Victor");

        ListIterator<String> iterator = names.listIterator();
        while(iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("\nAfter removing:");

        names.removeFirst();
        names.removeLast();
        String first = names.getFirst();
        String last = names.getLast();

        //Using foreach instead of iterator.
        for (String s: names)
        {
            System.out.println(s);
        }

        System.out.println(first + " and " + last);

    }
}
