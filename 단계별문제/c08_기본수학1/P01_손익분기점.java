/* 손인분기점  */
// a + b*x <= c*x 인 최소값 x를 구한다
// x >= a / (c-b)를 만족하는 최소 자연수
package 단계별문제.c08_기본수학1;

import java.util.Scanner;

public class P01_손익분기점 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int count = 0;

		if (c <= b)
			count = -1;
		else
			count = a / (c - b) + 1;
		System.out.println(count);

	}
}