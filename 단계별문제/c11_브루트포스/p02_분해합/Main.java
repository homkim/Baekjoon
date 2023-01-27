/**
 * self number 찾기
 */
package 단계별문제.c11_브루트포스.p02_분해합;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			if (getSelfNum(i) == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);
	}

	private static int getSelfNum(int n) {
		
		String str = String.valueOf(n);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		
		return n + sum;
	}
}
