import java.util.*;
public class Linked_list3 {
    public static void main(String[] args) {
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Pink");
        l_list.add("orange");
        System.out.println("Original linked list:" + l_list);
        Iterator i = l_list.descendingIterator();
        System.out.println("Elements in Reverse Order:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
