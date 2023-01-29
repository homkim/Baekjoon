package sources;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 1920 수 찾기
// 수열의 갯수 N은 10만 이하 자연수
// 쿼리의 갯수 M은 10만 이하 자연수
// 값은 정수범위
class Bj1920_수찾기_해시맵 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) map.put(Integer.parseInt(st.nextToken()), 1);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < M; i++) {
			int x = Integer.parseInt(st.nextToken());
			if(map.containsKey(x)) sb.append(1).append("\n");
			else sb.append(0).append("\n");
				
		}
		System.out.println(sb);
		
		
	}
}