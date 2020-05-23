/* 배열의 최대값 및 인덱스 번호 */
package com.javalec.lab62;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 9;
		int maxVal = 0;
		int idx = 0;
		
		for(int i = 0; i < 9; i++) {
			int t = sc.nextInt();
			
			if(t > maxVal) {
				maxVal = t;
				idx = i + 1;
			}
		}
		
		System.out.println(maxVal);
		System.out.println(idx);
	}
}