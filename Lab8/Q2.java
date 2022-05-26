package Lab8;

import java.util.LinkedList;
import java.util.ListIterator;

public class Q2 {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Kay");
        names.add("Jay");
        names.add("May");
        names.add("Fay");

        ListIterator<String> iterator = names.listIterator();

        while(iterator.hasNext())
        {
            String name = iterator.next();
            if(name.equals("May"))
            {
                iterator.add("Ray");
            }
        }

        System.out.println("Added Ray in after May: ");
        for (String s: names)
        {
            System.out.println(s);
        }

        while(iterator.hasPrevious())
        {
            String name = iterator.previous();
            if(name.equals("Jay"))
            {
                iterator.remove();
            }
        }

        System.out.println("\nDeleting Jay: ");
        for (String s: names)
        {
            System.out.println(s);
        }

        ListIterator<String> start = names.listIterator(0);

        System.out.println("\nDisplaying list from beginning: ");

        while(start.hasNext())
        {
            String name = start.next();
            System.out.println(name);
        }

        ListIterator<String> finish = names.listIterator(names.size());

        System.out.println("\nDisplaying list from end: ");

        while(finish.hasPrevious())
        {
            String name = finish.previous();
            System.out.println(name);
        }
    }
}
