/* 평균 넘은 학생수 비율 */
package 단계별문제.c04_1차원배열;

import java.util.Scanner;

public class P07_평균 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] a1 = new int[n];
			int sum = 0, cnt = 0;
			double avg, perc;
			
			for (int j = 0; j < n; j++) {
				a1[j] = sc.nextInt();
				sum += a1[j]; 
			}
			avg = sum * 1.00000 / n;
			for (int j = 0; j < n; j++) {
				if (a1[j] > avg) cnt++;
			}
			perc = cnt * 100.000 / n;
			System.out.println(String.format("%.3f", perc) + "%");
			
		}

	}
}