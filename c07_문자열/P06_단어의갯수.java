/* 상수의 대답 */
package c07_문자열;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P06_단어의갯수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st.countTokens());
	}
}

