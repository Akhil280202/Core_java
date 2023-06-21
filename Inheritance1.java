class Calculation{
    int result;
    public void addition(int a,int b){
        result=a+b;
        System.out.println(result);
    }
    public void sub(int a,int b){
        result=a-b;
        System.out.println(result);
    }
    public void multi(int a,int b){
        result=a*b;
        System.out.println(result);
    }
}
public class Inheritance1 extends Calculation{
    public static void main(String[]args){
        int a=79;
        int b=92;
        Inheritance1 cal=new Inheritance1();
        cal.addition(a,b);
        cal.sub(a,b);
        cal.multi(a,b);
    }
}
