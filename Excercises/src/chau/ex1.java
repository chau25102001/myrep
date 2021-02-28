package chau;
import java.util.Scanner;
public class ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("first number: ");
		double num1 = scanner.nextDouble();
		System.out.print("second number: ");
		double num2 = scanner.nextDouble();
		System.out.println("the sum is: "+ (num1+num2));
		System.out.println("the difference is: "+ (num1 -num2));
		System.out.print("the product is: "+(num1*num2));
		System.out.print("the quotient is: "+(num1/num2));
	}

}
