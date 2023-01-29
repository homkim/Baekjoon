package 단계별문제.c03_반복문;

/**
 * 구구단 
 */
import java.util.Scanner;

public class P01_구구단 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 1; i < 10; i++)
			System.out.println(n + " * " + i + " = " + (n * i));

	}
}