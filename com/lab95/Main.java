/* 달팽이 이동시간 */
package com.lab95;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int v = sc.nextInt();
		
		int result = (int) Math.ceil( (v-b)*1.00 /(a-b));
		
		System.out.println(result);
	}
}