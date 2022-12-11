/* 설탕배달  */
// 5x + 3y  :제일 빠른 거 찾아서 출력
package c08_기본수학1;

import java.util.Scanner;

public class P07_설탕배달 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int order = sc.nextInt();
		int f = order / 5;   //5kg 최대봉지수
		int t = order / 3;   //3kg 최대봉지수
		
		boolean found = false;
		int e = -1;
		for (int i = f; i >= 0; i--) {
			for (int j = 0; j <= t; j++) {
				if( i*5 + j*3 == order) {
					e = i + j;
					found = true;
					break;
				}
			}
			if(found) break;
		}
		System.out.println(e);
	}
}