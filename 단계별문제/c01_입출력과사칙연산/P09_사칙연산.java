package 단계별문제.c01_입출력과사칙연산;
/**
 * 사칙연산
 * @author mynote
 *
 */
import java.util.Scanner;

public class P09_사칙연산 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println( a + b );
        System.out.println( a - b );
        System.out.println( a * b );
        System.out.println( a / b );
        System.out.println( a % b );

    }
}
