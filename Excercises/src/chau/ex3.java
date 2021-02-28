package chau;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter n: ");
		int n = scanner.nextInt();
		for (int i =0; i<n; i++) {
			System.out.println(" ".repeat(n-i)+"*".repeat(2*i+1)+" ".repeat(n-i));
			
		}
	}

}
