package sources;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//10816 숫자카드2_배열
class Bj10816_숫자카드2_배열 {
	static final int MAX = 10_000_000;
	static final int[] arr = new int[2*MAX+1];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[Integer.parseInt(st.nextToken()) + MAX]++;
		}

		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < M; i++) 
			sb.append(arr[Integer.parseInt(st.nextToken()) + MAX]).append(" ");
		
		System.out.println(sb);
	}
}