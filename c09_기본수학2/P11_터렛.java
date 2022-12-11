/**
 * 두 원의 교차점 찾기
 * 교차점의 갯수를 계산한다. 완전히 일치하면 -1
 */

package c09_기본수학2;

import java.util.Scanner;

public class P11_터렛 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for (int i = 0; i < t; i++) {
			int x1 = sc.nextInt();
			int y1 = sc.nextInt();
			int r1 = sc.nextInt();
			int x2 = sc.nextInt();
			int y2 = sc.nextInt();
			int r2 = sc.nextInt();

			int cnt = 0;
			double d = Math.sqrt( (x1 - x2) * (x1 - x2) * 1.0 + (y1 - y2) * (y1 - y2) * 1.0);
			if (x1 == x2 && y1 == y2) {
				if (r1 == r2)
					cnt = -1;
				else
					cnt = 0;
			} else if (d == r1 + r2)
				cnt = 1;
			else if ( d + Math.min(r1, r2) == Math.max(r1, r2))
				cnt = 1;			
			else if ( d + Math.min(r1, r2) < Math.max(r1, r2))
				cnt = 0;
			else if (d < r1 + r2)
				cnt = 2;
			else if (d > r1 + r2)
				cnt = 0;
			

			System.out.println(cnt);

		}
	}

}
