import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2104 부분배열 고르기
class Bj2104_부분배열고르기_이분법 {
	static final int MAX = 1_000_001;
	static int N;
	static int[] arr, trr;
	static long[] sum;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N+1];
		sum = new long[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i] = arr[i] + sum[i-1];
		}
		arr[0] = MAX;
		trr = new int[4*N];
		update(1,1,N);
		
		long ans = solve(1, N);
		System.out.println(ans);
	}
	static long solve(int from, int to) {
		int minIdx = find(from, to, 1, 1, N);
		long res = (sum[to] - sum[from - 1]) * arr[minIdx];
		if(from == to) return res;
		
		if(from < minIdx) {
			long tmp = solve(from, minIdx -1);
			if(res < tmp) res = tmp;
		}
		
		if(minIdx < to) {
			long tmp = solve(minIdx+1, to);
			if(res < tmp) res = tmp;
		}
		return res;
		
	}
	static int update(int node, int nodeL, int nodeR) {
		if(nodeL == nodeR) 
			return trr[node] = nodeL;
		
		int mid = nodeL + (nodeR - nodeL) / 2;
		int l = update(2*node, nodeL, mid);
		int r = update(2*node+1, mid+1, nodeR);
		return trr[node] = getIdx(l,r);
	}
	static int find(int from, int to, int node, int nodeL, int nodeR) {
		if(from > nodeR || to < nodeL) return 0;//0의 값은 max로
		
		if(from <= nodeL && nodeR <= to) return trr[node];
		
		int mid = nodeL + (nodeR - nodeL) / 2;
		int l = find(from, to, 2*node, nodeL, mid);
		int r = find(from, to, 2*node+1, mid+1, nodeR);
		return getIdx(l, r);
		
	}
	static int getIdx(int l, int r) {
		if(arr[l] < arr[r]) return l;
		else return r;
	}
}