/* 벌집의 셀주소의 가장 가까운 경로수  */
// 1, 7, 19, 37, 61
//    6, 12, 18  24
//  1 + 6*x = n -> x =  ceil( (n-1)/6 ) + 1 로 계산하면 됨
//  첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
package c08_기본수학1;

import java.util.Scanner;

public class P02_벌집 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int path = 1;
		int a = 1;
		for (int i = 2; i <= n; i++) {
			a = a + 6 * (i - 1);

			if (n <= a) {
				path = i;		
				break;
			}

		}
		System.out.println(path);
	}

}