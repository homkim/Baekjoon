package 단계별문제.c04_1차원배열;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

// 5579 과제 미제출자
class Bj5579_과제안내신분 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		HashMap<Integer, Integer> map = new HashMap();
		for(int i = 1; i <= 30; i++) map.put(i, 1);
		
		for(int i = 1; i <= 28; i++) {
			int x = Integer.parseInt(br.readLine());
			if(map.containsKey(x)) map.remove(x);
		}
		
		for(int x : map.keySet()) {
			System.out.println(x);
		}
	}
}