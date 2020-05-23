/* 셀프숫자 */
package com.javalec.lab72;

import java.util.ArrayList;

public class Main {
	public static ArrayList<Integer> al;
	
	public static void main(String[] args) {

		fillAl();
		for (int i = 1; i <= 10000; i++) {
			if( !al.contains(i) )
				System.out.println(i);
		}
	}

	private static void fillAl() {
		al = new ArrayList<>();
		for (int i = 1; i <= 10000; i++) {
			String iStr = String.valueOf(i);
			int num = 0;
			for (int j = 0; j < iStr.length(); j++) {
				num += Integer.parseInt(iStr.substring(j,j+1));				
			}
			al.add(num + i);
			
		}
		
	}
}