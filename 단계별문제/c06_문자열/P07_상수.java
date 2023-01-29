/* 상수의 숫자 읽기  */
package 단계별문제.c06_문자열;

import java.util.Scanner;

public class P07_상수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer bf = new StringBuffer();

		bf.append(sc.next());		
		Integer i1 = Integer.parseInt( bf.reverse().toString() );
		
		bf.setLength(0);//초기화
		bf.append(sc.next());
		Integer i2 = Integer.parseInt( bf.reverse().toString() );
		
		System.out.println( Math.max(i1, i2));
		
	}
}