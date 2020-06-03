package com.javalec.labc2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int len = String.valueOf(n).length();

		if (len == 1) {
			System.out.println(n);
			return;
		}

		int a = n - len * 9;
		if (a < 1)
			a = 1;
		int b = a;   //시작값
		int div = 1; // 나눔
		int temp = 0;
		int n2 = n;
		for (int i = a; i <= n; i++) {
			if (div == 1) {
				n2 = n % 10;
				b += n % 10;
			} else {
				temp = (b / div);
				temp = temp % 10;
				b += temp;
			}

			if (b == n)
				break;

			div *= 10;
		}
		if (b == n)
			System.out.println(a);
		else
			System.out.println(0);
	}
}
