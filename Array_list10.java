import java.util.*;
public class Array_list10 {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println("List before reversing :" + list_Strings);
        Collections.reverse(list_Strings);
        System.out.println("List after reversing :" + list_Strings);
    }
}
