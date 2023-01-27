
public class Test {

	public static void main(String[] args) {
		
	int[] a = {1, 2, 3, 4};
	
	StringBuffer sb = new StringBuffer();
	for(int x : a) sb.append(x).append("\n");
	
	System.out.println(sb);
	System.out.println(sb);
		
	}
}
