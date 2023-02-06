/**
 * 가장 가까운 세수의 합 구하기 
 */
package 단계별문제.c12_브루트포스.p01_블랙잭;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] arr = new int[n];
		int sum = 0, max = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (sum == m) {
						System.out.println(m);
						return;
					} else if (sum < m && sum > max)
						max = sum;
				}
			}

		}
		System.out.println(max);
	}
}
