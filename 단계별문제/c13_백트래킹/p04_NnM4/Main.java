package 단계별문제.c13_백트래킹.p04_NnM4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int N,M;
	public static int[] arr;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		
		dfs(0, 0);
		System.out.println(sb);
	}

	private static void dfs(int start, int d) {
		// TODO Auto-generated method stub
		if (d == M ) {
			for(int val: arr)
				sb.append(val).append(" ");
			sb.append("\n");
			return;
		}
		
		for (int i = start; i < N; i++) {
	    	arr[d] = i + 1;
			dfs(i, d + 1);
		}
	}
}
