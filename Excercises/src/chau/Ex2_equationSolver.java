package chau;
import java.util.Scanner;
public class Ex2_equationSolver {
	public static void firstOrderEquation(float a, float b) {
	if(a==0) {
			if (b==0) {
				System.out.print("the equation has infinite many roots");
				
			}else {
				System.out.print("the equation has no root");
			}
		}
		else {
		System.out.print("the root is: " + (-b/a));
		}	
	}
	public static void systemOfFirstOrder(float a11, float a12, float b1, float a21, float a22, float b2) {
		float d = a11*a22-a21*a12;
		float d1 = b1*a22-b2*a12;
		float d2 = a11*b2- a21*b1;
		if (d ==0) {
			if (d1==0&&d2==0) {
				System.out.print("the system has infinite many roots");
			}
			else {
				System.out.print("the system has no roots");
				
			}
		}else {
			System.out.print("x1 = "+ d1/d);
			System.out.print("x2 = "+ d2/d);
		}
	}
	public static void secondOrderEquation(float a, float b,float c) {
		float delta = (float)Math.pow(b,2)-4*a*c;
		if (delta<0) {
			System.out.print("the equation has no root");
		}
		else if (delta ==0) {
			System.out.print("x1 = x2= "+-b/(2*a));
		}else {
			System.out.print("x1 = "+ ((-b-Math.sqrt(delta))/4/a));
			System.out.print("x2 = "+((-b+Math.sqrt(delta))/4/a));
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the type of equation 1, 2, 3 ?:");
		String type = scanner.nextLine();
		switch(type) {
		case "1":
			System.out.print("enter a: ");
			float a = scanner.nextFloat();
			System.out.print("enter b: ");
			float b = scanner.nextFloat();
			firstOrderEquation(a,b);
		case "2":
			System.out.print("enter a11: ");
			float a11 =scanner.nextFloat();
			System.out.print("enter a12: ");
			float a12 = scanner.nextFloat();
			System.out.print("enter b1: ");
			float b1 = scanner.nextFloat();
			System.out.print("enter a21: ");
			float a21 = scanner.nextFloat();
			System.out.print("enter a22: ");
			float a22 = scanner.nextFloat();
			System.out.print("enter b2: ");
			float b2 = scanner.nextFloat();
			systemOfFirstOrder(a11,a12,b1,a21,a22,b2);
		case "3":
			System.out.print("enter a: ");
			float parameter1 = scanner.nextFloat();
			while (parameter1==0) {
				System.out.print("invalid a, re-enter: ");
				parameter1=scanner.nextFloat();}
			System.out.print("enter b: ");
			float parameter2 = scanner.nextFloat();
			System.out.print("enter c: ");
			float parameter3 = scanner.nextFloat();
			secondOrderEquation(parameter1, parameter2, parameter3);
			
		}
		
	}

}
//lol//
//shit

