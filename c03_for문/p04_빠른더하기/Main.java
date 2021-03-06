/**
 * 빠른 더하기
 */
package c03_for문.p04_빠른더하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(bf.readLine());
		for (int test_case = 0; test_case < T; test_case++) {
			String str = bf.readLine();
			StringTokenizer st = new StringTokenizer(str);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int sum = a + b;		
			bw.write(sum + "\n");
		}
		bw.flush();
		bw.close();
	}
}