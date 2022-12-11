package c03_for문;

/**
 * 더하기 
 */
import java.util.Scanner;

public class P07_AB7 {
	static int T = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			int i = sc.nextInt();
			int j = sc.nextInt();

			System.out.println("Case #" + (test_case+1) + ": " + (i + j));
		}
	}
}