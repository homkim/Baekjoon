package sources;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//2776 암기왕 : 바이너리서치

class Bj2766_암기왕_바이너리서치 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuffer sb = new StringBuffer();
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] num = new int[N];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				int x = Integer.parseInt(st.nextToken());
				num[i] = x;				
			}
			Arrays.sort(num);
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) {
				int x = Integer.parseInt(st.nextToken());
				if(Arrays.binarySearch(num, x) >= 0)
					sb.append("1\n");
				else
					sb.append("0\n");
			}
			
		}
		System.out.println(sb);
	}
}