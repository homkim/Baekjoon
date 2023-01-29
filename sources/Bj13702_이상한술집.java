package sources;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 13702 이상한 술집

class Bj13702_이상한술집 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken()); //주전자수 1만이하 정수
		int K = Integer.parseInt(st.nextToken()); //친구수 백만 이하 정수
		int[] arr = new int[N]; // 막걸리 용량
		
		int max = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			max = Integer.max(max, arr[i]);
		}
		
		long begin = 0;
		long end = max; end++; //upper bound + type
		long ans = 0;
		while (begin < end) {
			long mid = (begin + end) / 2;
			long res = 0;
			for(int x : arr) {
				res += ( x / mid ); //mid잔씩 몇 개가 나오는지				
			}
			
			if( res >= K) {
				// 잔이 더 많이 나와 용량 증가
				begin = mid + 1;
			} else {
				end = mid;
			}
		}
		System.out.println( end - 1);
		
		
	}
}