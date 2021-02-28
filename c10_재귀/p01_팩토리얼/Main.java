/**
 * factorial구하는 재귀함수
 * 정수n 0 ~ 12가 주어짐
 */
package c10_재귀.p01_팩토리얼;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = fact(n);
		System.out.println( result );
	}

	private static int fact(int n) {
		if( n <= 1)
			return 1;
		else
			return n*fact(n-1);
	}
}
