package c13_백트래킹.p01_NnM1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static int N,M;
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		
		dfs(0);
		System.out.println(sb);
	}

	private static void dfs(int d) {
		// TODO Auto-generated method stub
		if (d == M) {
			for(int val: arr)
				sb.append(val).append(" ");
			sb.append("\n");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[d] = i + 1;
				dfs(d + 1);
				visit[i] = false;
			}
		}
	}
}
