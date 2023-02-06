import java.util.Scanner;

// 참외밭
class Main {
	static final String[] sptn = { "3131", "1414", "4242", "2323"};
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer()
				;
		int N = sc.nextInt();
		
		int w=0, x2=0, y1=0, y2=0;

		String str = "";
		int[][] input = new int[6][2];
		for(int i = 0; i < 6; i++) {
			input[i][0] = sc.nextInt();
			input[i][1] = sc.nextInt();
			
			str += String.valueOf(input[i][0]);
		}
		str += str; //두개를 엎어서 패턴을 찾기 위함

		for(String st : sptn) {
			int pos = str.indexOf(st);
			if( pos >= 0) {
				if(st.charAt(1) <= '2' ) {
					x2 = input[++pos % 6][1];
					y2 = input[++pos % 6][1];
				}
				else {
					y2 = input[++pos % 6][1];
					x2 = input[++pos % 6][1];
				}
				break;
			}
			
		}
		for(int i = 0; i < 6; i++) {
			if(input[i][0] < 3)
				w = Math.max(w, input[i][1]);
			else
				y1 = Math.max(y1, input[i][1]);
		}
		sb.append((w*y1 - x2*y2)*N);
		
		System.out.println(sb);
	}
}