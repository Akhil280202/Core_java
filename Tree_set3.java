import java.util.*;
public class Tree_set3 {
    public static void main(String[] args) {
        TreeSet<String> t_set = new TreeSet<String>();
        t_set.add("Red");
        t_set.add("Green");
        t_set.add("Black");
        t_set.add("Pink");
        t_set.add("orange");
        System.out.println("Original tree set:" + t_set);
        Iterator it = t_set.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Object first_element = t_set.first();
        System.out.println("First Element is: "+first_element);
        Object last_element = t_set.last();
        System.out.println("Last Element is: "+last_element);
    }
}
