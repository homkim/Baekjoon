package 단계별문제.c03_반복문;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class P09_별1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n ; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}