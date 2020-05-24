/* 주어진 문자열에서 각 알파벳 최초 인덱스 값  */
// a:97, z:122
// 문자열 값은 모두 소문자로 주어짐
package com.javalec.lab83;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
	
		for(int i = (int)('a'); i <= (int)('z'); i++) {
			System.out.print(str.indexOf(Character.toString((char)i)) + " ");
		}
		
		
	}
}