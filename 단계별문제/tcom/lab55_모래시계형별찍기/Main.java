/**
 * 모래시계형 별 찍기
 */
package 단계별문제.tcom.lab55_모래시계형별찍기;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < 2 * n - 1; i++) {
			int x = 0, y = 0;
			if (i < n) {
				x = 2 * (n - i) - 1; // 별 갯수
			} else {
				x = 2 * (i + 1 - n) + 1;
			}
			y = ((2 * n - 1) - x) / 2;

			for (int j = 0; j < y; j++)
				System.out.print(" ");

			for (int j = 0; j < x; j++)
				System.out.print("*");
			System.out.println("");
		}
	}
}