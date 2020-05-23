/* ox퀴즈 */
package com.javalec.lab66;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); sc.nextLine();
		for (int i = 0; i < n; i++) {
			int score = 0, total_score = 0;
			char[] c1 = sc.nextLine().toCharArray();

			for (int j = 0; j < c1.length; j++) {
				if (c1[j] == 'O') {
					score++;
				} else {
					score = 0;
				}
				total_score += score;
			}
			System.out.println(total_score);
		}
	}
}