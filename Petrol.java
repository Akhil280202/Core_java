package Project1;
import java.util.*;
public class Petrol {
		public double petrol=0;
		double amount;
		double cap=12;
		Scanner s=new Scanner(System.in);
		public double choose() {
			System.out.println("ENTER YOUR CHOICE");
			System.out.println("1.ADD PETROL");
			System.out.println("2.DISPLAY BALANCE PETROL LEFT");
			System.out.println("3.REMOVE PETROL FOR KMS TRAVELLED");
			System.out.println("0.EXIT");
			return s.nextInt();
		}
		double ex=0;
		public  double addpetrol(double amt) {
			amount=amt;
			petrol=amt/102;
			ex=petrol-12;
			if(petrol>12) {
				System.out.println("Excess petrol of "+ex+" added");
			}
			petrol=petrol-ex;
			return petrol;
		}
		public double addpower(double amt) {
			amount=amt;
			petrol=petrol+amt/105;
			ex=petrol-12;
			if(petrol>12) {
				System.out.println("Excess petrol of "+ex+" added");
			}
			petrol=petrol-ex;
			return petrol;
		}
		public double display() {
			System.out.printf("THE BALANCE LITERS OF PETROL LEFT IS: %.2f",petrol);
			System.out.println();
			return petrol;
		}
		public double removepetrol(double km) {
			double lit=km/40;
			petrol=petrol-lit;
			return petrol;
		}
		public void low(){
			if(petrol<2) {
				System.out.println("LOW FUEL");
			}
			
		}
}
