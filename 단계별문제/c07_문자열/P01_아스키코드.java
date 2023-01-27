/* 아스키값 출력  */
package 단계별문제.c07_문자열;

import java.util.Scanner;

public class P01_아스키코드 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c = sc.next().charAt(0);
		
		System.out.println((int)c);
	}
}