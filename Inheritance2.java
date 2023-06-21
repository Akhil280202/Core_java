class Demo{
    public void display(){
        System.out.println("SUPERCLASS");
    }
}
public class Inheritance2 extends Demo{
    public void display(){
        System.out.println("SUBCLASS");
    }
    public void method(){
        Inheritance2 d=new Inheritance2();
        d.display();
        super.display();
    }
    public static void main(String[]args){
        Inheritance2 adj=new Inheritance2();
        adj.method();
    }
}
