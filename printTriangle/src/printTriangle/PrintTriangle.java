package printTriangle;
import java.util.Scanner;
public class PrintTriangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter n: ");
		int n = scanner.nextInt();
		for (int i =0; i<n; i++) {
		System.out.println(" ".repeat(n-i)+"*".repeat(2*i+1)+" ".repeat(n-i));
					
		}

	}

}
