/* 각 자릿수 합계  */
package 단계별문제.c06_문자열;

import java.util.Scanner;

public class P02_숫자의합 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String str = sc.next();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(str.substring(i, i+1));
		}
		System.out.println(sum);
	}
}