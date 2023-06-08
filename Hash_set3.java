import java.util.*;
public class Hash_set3 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println("Original Hash Set: " + h_set);
        String[] arr = new String[h_set.size()];
        h_set.toArray(arr);
        System.out.println("Array elements: ");
        for(String element : arr){
            System.out.println(element);
        }
    }
}
