public class Generics3 <A>{
    private A a;
    public void add(A a){
        this.a=a;
    }
    public A get(){
        return a;
    }
    public static void main(String[]args){
        Generics3<Integer> ab=new Generics3<Integer>();
        Generics3<String> bc=new Generics3<String>();
        ab.add(new Integer(10));
        bc.add(new String("ABCD"));
        System.out.println(ab.get());
        System.out.println(bc.get());
    }
}
