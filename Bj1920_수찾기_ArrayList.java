import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

// 1920 수 찾기
// 수열의 갯수 N은 10만 이하 자연수
// 쿼리의 갯수 M은 10만 이하 자연수
// 값은 정수범위
class Bj1920_수찾기_ArrayList {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		ArrayList<Integer> al = new ArrayList<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) al.add(Integer.parseInt(st.nextToken()));
		Collections.sort(al);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < M; i++) {
			int x = Integer.parseInt(st.nextToken());
			int y = getResult(al,0, al.size()-1, x);
			sb.append(y).append("\n");
				
		}
		System.out.println(sb);
		
		
	}
	static int getResult(ArrayList<Integer> al,int begin, int end, int x) {
		if (begin > end) return 0;
		
		int mid = (begin + end) / 2;
		int z = al.get(mid);
		if(z == x) return 1;
		else if (z < x) 
			return getResult(al, mid+1, end, x);
		else 
			return getResult(al, begin, mid-1, x);
		
	}
}