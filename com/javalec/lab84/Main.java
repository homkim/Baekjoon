/* 주어진 문자열에서 반복  */
package com.javalec.lab84;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String str2 = "";
		for (int i = 0; i < t; i++) {
			int n = sc.nextInt();
			String str = sc.next();
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < str.length(); j++) {
				for (int k = 0; k < n; k++) {
					sb.append(str.substring(j, j+1));
				}
			}
			System.out.println(sb.toString());
		}
	}
}