// 소수구하기
// 소수란 1과 자신 말고 나누어지지 않는 숫자
package com.laba1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();
			
			if(num == 1) continue;
			boolean isPrime = true;
			for (int j = 2; j < num ; j++) {
				if(num % j == 0) { 
					isPrime = false;
					break;
				}
			}
			if(isPrime) cnt++;
			
		}
		System.out.println(cnt);
	}

}
