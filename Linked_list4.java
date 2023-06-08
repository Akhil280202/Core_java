import java.util.*;
public class Linked_list4 {
    public static void main(String[] args) {
        LinkedList <String> l_list = new LinkedList <String> ();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("White");
        l_list.add("Pink");
        System.out.println("Let add the Yellow color after the Red Color: ");
        l_list.add(1, "Yellow");
        System.out.println(l_list);
    }
}
