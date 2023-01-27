/* 단어에서 가장 많이 사용된 알파벳 찾기  */
package 단계별문제.c07_문자열;

import java.util.Arrays;
import java.util.Scanner;

public class P05_단어공부 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next().toUpperCase();
		
		// 빈도계산용 배열정의 및 초기화
		int[] arr = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 0;
		}
		
		// 알파벳 빈도 저장
		for (int i = 0; i < str.length(); i++) {
			arr[(int)str.substring(i, i+1).charAt(0) - (int)('A')]++;
		}
		
		// 최대빈도 및 ascii 코드값 저장
		int maxVal = 0;
		int maxIdx = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > maxVal) {
				maxVal = arr[i];
				maxIdx = i;
			}
		}
		
		Arrays.sort(arr);
		if (arr[arr.length - 1] == arr[arr.length - 2])
			System.out.println("?");
		else
			System.out.println( (char)(maxIdx + (int)('A')));
	}
}