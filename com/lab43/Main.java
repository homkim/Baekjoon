
/**
 * 빠른 더하기
 */
package com.lab43;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int n2 = num;
		int c = 0;

		while (true) {
			int a = n2 / 10;
			int b = n2 - a * 10;
			n2 = (a + b) % 10 + b * 10;
			
			c++;
			if (n2 == num)
				break;

		}
		System.out.println(c);

	}
}