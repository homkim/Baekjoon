import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileCreator {
	public static void main(String[] args) throws Exception {
		BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
		bw.write("1000000\n");
		for(int i = 1000000; i > 0; i--)
			bw.write(i + "\n");
		bw.flush();
		bw.close();
	}
}
