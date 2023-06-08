import java.util.*;
public class Linked_list17 {
    public static void main(String[] args) {
        LinkedList<String> linked_list = new LinkedList<String>();
        linked_list.add("Red");
        linked_list.add("Green");
        linked_list.add("Black");
        linked_list.add("White");
        linked_list.add("Pink");
        System.out.println("Original linked list: " + linked_list);
        ArrayList<String> list = new ArrayList<String>(linked_list);
        for (String str : list) {
            System.out.println(str);
        }
    }
}
