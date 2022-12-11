package c03_for문;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class P06_기찍N {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)
			System.out.println(i);
	}
}