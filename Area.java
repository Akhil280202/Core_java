package oops;
class Rectangle{
    private int width;
    private int height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public int getArea(){
        return width*height;
    }
    public int getPerimeter(){
        return 2*(height+width);
    }
}
public class Area {
    public static void main(String[]args){
        Rectangle rectangle=new Rectangle(10,20);
        System.out.println("The area is "+rectangle.getArea());
        System.out.println("The peremeter is "+rectangle.getPerimeter());
    }
}
