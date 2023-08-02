package Project1;
import java.util.*;
public class Fuel {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		Petrol  p=new Petrol();
		double choice=p.choose();
		double bal=p.petrol;
		double amt;
		double km;
		int ty;
		while(true) {
			if(choice==1) {
				System.out.println("ENTER TYPE OF PETROL");
				System.out.println("1.NORMAL");
				System.out.println("2.POWER");
				ty=sc.nextInt();
				System.out.println("ENTER AMOUNT TO FILL PETROL");
				amt=sc.nextDouble();
				if(ty==1) {
					bal=p.addpetrol(amt);	
				}
				else {
					bal=p.addpower(amt);
				}
				System.out.println("FUEL ADDED");
				p.low();
				choice=p.choose();
				
			}
			else if(choice==2) {
				bal=p.display();
				p.low();
				choice=p.choose();
			}
			else if(choice==3) {
				System.out.println("ENTER KMS TRAVELLED");
				km=sc.nextDouble();
				bal=p.removepetrol(km);
				p.low();
				choice=p.choose();
			}
			else {
				System.out.println("THANK YOU");
				break;
			}
		}
		sc.close();
		
	}

}
