package 단계별문제.c11_재귀;
import java.util.Scanner;

//25501 재귀의 귀재 - 재귀
class Bj22501_재귀의귀재 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 0; tc < T; tc++) {
			String str = sc.next();
			
			int count = 0;
			int ans = isPelindrom(str, count);
			System.out.println(ans);
		}
	}
	static int isPelindrom(String str, int count) {
		count = recursion(str, 0, str.length()-1, count);
		return count;
	}
	private static int recursion(String str, int start, int end, int count) {
		// 중단 조건: pelindrom 이 아니거나, start가 end보다 크거나 같은 경우
		count++;
		
		if(start >= end) {
			System.out.print("1 ");
			return count;
		}

		if(str.charAt(start) != str.charAt(end)) { 
			System.out.print("0 ");
			return count;
		}
		
		return recursion(str, start+1, end-1, count);
	}
}