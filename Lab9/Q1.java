package Lab9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Q1 {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<String>(); // new HashSet<String>(); -> for unordered set.
        names.add("Romeo");
        names.add("Diana");
        names.add("Tom");
        names.add("Harry");
        names.add("Tom");// will not be added, duplicates not allowed

        if (names.contains("Diana"))
            System.out.println("Diana in the list\n");//expect this
        else
            System.out.println("Diana not in the list");

        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            // Do something with name
            System.out.println(name);
        }
    }
}
