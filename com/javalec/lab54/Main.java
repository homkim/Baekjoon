/**
 * 별찍기
 */
package com.javalec.lab54;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = 0;
		for (int i = 0; i < 2 * n - 1; i++) {
			if (i < n)
				k = i;
			else
				k--;

			for (int j = 0; j <= k; j++)
				System.out.print("*");

			System.out.println("");
		}

	}
}