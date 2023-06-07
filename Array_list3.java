import java.util.*;
public class Array_list3 {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");
        System.out.println(list_Strings);
        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(3);
        System.out.println("Fourth element: "+element);
    }
}
