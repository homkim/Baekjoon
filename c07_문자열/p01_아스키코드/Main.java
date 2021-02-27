/* 아스키값 출력  */
package c07_문자열.p01_아스키코드;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);
		
		System.out.println((int)c);
	}
}