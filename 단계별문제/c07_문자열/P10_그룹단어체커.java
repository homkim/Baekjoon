/* 그룹단어 판별  */
package 단계별문제.c07_문자열;

import java.util.Scanner;

public class P10_그룹단어체커 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int cnt = 0;
		for (int i = 0; i < t; i++) {
			String str = sc.next();

			Boolean flag = true; 
			for (int j = 1; j < str.length(); j++) {
				if (str.substring(j, j+1).equals(str.substring(j-1, j))) {
					continue;
				} else if(str.substring(0, j-1).contains(str.substring(j, j+1)) ){
					flag = false;
				}		
			}
			if(flag) cnt++;
		}
		System.out.println(cnt);

	}
}