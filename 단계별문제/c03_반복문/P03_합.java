package 단계별문제.c03_반복문;

/**
 * n까지의 합 
 */
import java.util.Scanner;

public class P03_합 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;

		for (int i = 1; i < n + 1; i++)
			sum += i;

		System.out.println(sum);
	}
}