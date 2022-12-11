/* 함수구현 */
package c06_함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P01_정수N개의합 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int cnt = st.countTokens();
		int[] arr = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		long result = sum(arr);
		System.out.println(result);
		

	}
	static long  sum(int[] a) {
		long s1 = 0;
		for (int i = 0; i < a.length; i++) {
			s1 += a[i];
		}
		return s1;
	}
}