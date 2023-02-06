/**
 * factorial구하는 재귀함수
 * 정수n 0 ~ 12가 주어짐
 */
package 단계별문제.c11_재귀;

import java.util.Scanner;

public class Bj10872_팩토리얼 {
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
