/* 호텔호실 배정 */
package c08_기본수학1;

import java.util.Scanner;

public class P05_ACM호텔 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			int n = sc.nextInt();

			int r1 = n % h;
			if(r1 == 0) r1 = h;
			int r2 = (int) Math.ceil(n * 1.0 / h);

			System.out.println(String.format("%d%02d", r1, r2));
		}

	}
}