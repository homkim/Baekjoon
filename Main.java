import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//4929 수열 걷기
class Main {
	static final int MAX = 10000;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			if(N == 0) break;
			
			int[] num1 = new int[MAX*2 + 1];
			int[] arr1 = new int[N+1];
			int[] sum1 = new int[N+1];
			for(int i = 1; i <= N; i++) {
				arr1[i] = Integer.parseInt(st.nextToken());
				sum1[i] = sum1[i-1] + arr1[i];
				num1[arr1[i] + MAX] = i; //인덱스 값
			}
			st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());

			int sum2 = 0;
			int ans = 0;
			int idx1=0;
			for(int i = 1; i <= M; i++) {
				int y = Integer.parseInt(st.nextToken());
				sum2 += y;
				
				if(num1[y + MAX] > 0) {
					int idx11 = num1[y + MAX];
					ans += Math.max(sum2, sum1[idx11] - sum1[idx1]);
					idx1 = num1[y + MAX];
					sum2 = 0;
				}  
			}
			ans += Math.max(sum2, sum1[N] - sum1[idx1]);

			sb.append(ans).append("\n");	
		}
		System.out.println(sb);
	}
}