/* 다이얼  */
// ABC 3초, DEF 4초, GHI 5초 ,,,
// 64,65,66: 3, 67,68,69: 4
// ASCII 값 64를 빼고 3으로 나눈 몫 + 3 sec
package 단계별문제.c06_문자열;

import java.util.Scanner;

public class P08_다이얼 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next().toUpperCase();
		int sec = 0;
		for (int i = 0; i < str.length(); i++) {
			if( str.substring(i, i+1).charAt(0) <= 'C' ) sec += 3; 
			else if( str.substring(i, i+1).charAt(0) <= 'F' ) sec += 4;
			else if( str.substring(i, i+1).charAt(0) <= 'I' ) sec += 5;
			else if( str.substring(i, i+1).charAt(0) <= 'L' ) sec += 6;
			else if( str.substring(i, i+1).charAt(0) <= 'O' ) sec += 7;
			else if( str.substring(i, i+1).charAt(0) <= 'S' ) sec += 8;
			else if( str.substring(i, i+1).charAt(0) <= 'V' ) sec += 9;
			else sec += 10;
			
		}
		System.out.println(sec);
	}
}