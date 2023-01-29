/**
 * 빠른 더하기
 */
package 단계별문제.c03_반복문;

import java.util.Scanner;

public class P02_AB4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}
		
	}
}