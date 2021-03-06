/**
 * 하노이 #1 
 */
package c10_재귀.p04_하노이탑;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
	static BufferedWriter bw;
	static String arr[];

	public static void main(String[] args) throws IOException {
		bw  = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		bw.write(String.valueOf( (int) (Math.pow(2, n)-1) ) );
		bw.newLine();

		hanoi(n, '1','3','2');
		
		bw.flush();

	}

	private static void hanoi(int n, char a, char b, char c) throws IOException {
		if(n == 0) return;
		
		hanoi(n-1, a, c, b);
		//System.out.println(a + " " + b);
		bw.write(a + " " + b);
		bw.newLine();

		hanoi(n-1, c, b, a);
		
	}
}
