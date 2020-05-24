/* 입력한 정수의 자릿수가 등차수열을 이루는 경우의 수(한수)  */
package com.javalec.lab73;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int cnt = 0;

		if (x < 100)
			cnt = x;
		else {
			cnt = 99;
			for (int i = 100; i <= x; i++) {
				String str = String.valueOf(i);
				int i1 = i / 100; // 1000도 포함되어 있음
				int i2 = (i % 100) / 10;
				int i3 = i % 10;

				if (i1 - i2 == i2 - i3)
					cnt++;
			}
		}
		System.out.println(cnt);
	}
}