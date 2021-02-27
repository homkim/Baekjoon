/* 상수의 숫자 읽기  */
package com.lab87;

import java.util.Scanner;

public class Main {
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