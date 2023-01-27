package 단계별문제.c01_입출력;
/**
 * 두수 나누기
 * @author mynote
 *
 */
import java.util.Scanner;

public class P08_나누기 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double c = a * 1.00000000000000 / b;
        System.out.println(c);

    }
}