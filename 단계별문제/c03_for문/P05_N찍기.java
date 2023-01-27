package 단계별문제.c03_for문;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class P05_N찍기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = n; i > 0; i--)
			System.out.println(i);
	}
}