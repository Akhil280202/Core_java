import java.util.*;
public class Linked_list2 {
    public static void main(String[] args) {
        // create an empty linked list
        LinkedList<String> l_list = new LinkedList<String>();
        // use add() method to add values in the linked list
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        Iterator i = l_list.listIterator(1);
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
