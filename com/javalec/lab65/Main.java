/* 평균 */
package com.javalec.lab65;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] a1 = new int[n];
		int maxVal = 0;
		double sum = 0.0;
		double avg = 0.0;

		for (int i = 0; i < n; i++) {
			a1[i] = sc.nextInt();
			if (a1[i] > maxVal)
				maxVal = a1[i];
		}
		for (int i = 0; i < n; i++) {
			sum += (a1[i] * 1.0000 / maxVal * 100);
		}
		avg = sum * 1.000 / n;
		System.out.println(avg);
	}
}