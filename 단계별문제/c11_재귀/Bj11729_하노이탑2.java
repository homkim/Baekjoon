package 단계별문제.c11_재귀;

import java.util.Scanner;

public class Bj11729_하노이탑2 {
	
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		hanoi(n, 1, 2, 3); // from, by, to
		System.out.println(cnt);
		System.out.println(sb);
	}

	private static void hanoi(int n, int a, int b, int c) {
		if(n < 1) return;
		
		cnt++;
		hanoi(n-1, a, c, b);
		sb.append(a+" "+c+"\n");
		hanoi(n-1, b, a, c);
		
	}
}
