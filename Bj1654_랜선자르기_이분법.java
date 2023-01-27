import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 1654 랜선자르기
class Bj1654_랜선자르기_이분법 {
	static int K, N, arr[];
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		K = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		arr = new int[K];
		int max = 0;
		for(int i = 0; i < K; i++) { 
			arr[i] = Integer.parseInt(br.readLine());
			max = Integer.max(max, arr[i]);
		}
		
		long begin = 0, end = max, mid = 0;
		end++; // int형인 max에서 계산금지
		
		while(begin < end) {
			mid = ( begin + end) / 2;
			if(mid == 0) {
				begin = 0;
				break;
			}
			int cnt = 0;
			for(int x : arr) cnt += x / mid;
			
			if(cnt >= N) 
				begin = mid + 1;
			else
				end = mid;
		}
		
		System.out.println(end-1);

	}
}