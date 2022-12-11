package c04_while문;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class P01_AB5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0, b = 0;
		while (true) {
			
			a = sc.nextInt();
			b = sc.nextInt();
			if (a > 0 || b > 0)
				System.out.println(a+b);
			else
				break;
		}
	}
}