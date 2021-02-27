package c03_for문.p10_별2;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n ; i++) {
			for(int k = 0; k < n - 1 - i; k ++)
				System.out.print(" ");
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}