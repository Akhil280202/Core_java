import java.util.*;
class Stack{
    int arr[];
    int s;
    int top=-1;
    Stack(int n){
        arr=new int[n];
        s=n;
    }
    void push(int data){
        if(top==s-1){
            System.out.println("STACK OVERFLOW");
        }
        else{
            top++;
            arr[top]=data;
        }
    }
    void display(){
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    void pop(){
        top--;
    }
    void peek(){
        System.out.println(arr[top]);
    }
}
public class Stack1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Stack s=new Stack(n);
        for(int i=0;i<n;i++){
            s.push(sc.nextInt());
        }
        s.display();
        s.pop();
        s.peek();
    }
}
