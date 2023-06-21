
public class Generics1 {
    public static <A> void printing(A[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[]args){
        Integer[] a={1,2,3,4,5,6,7,8,9,10};
        Character[] b={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Double[] c={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,0.0};
        String[] d={"abc","def","ghi","jkl","mno","pqr","stu","vwx","yZ"};
        System.out.println("INTEGER ARRAY");
        printing(a);
        System.out.println("CHARACTER ARRAY");
        printing(b);
        System.out.println("DOUBLE ARRAY");
        printing(c);
        System.out.println("STRING ARRAY");
        printing(d);
    }

}
