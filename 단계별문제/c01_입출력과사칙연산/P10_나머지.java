package 단계별문제.c01_입출력과사칙연산;
/**
 * 나머지
 * @author mynote
 *
 */
import java.util.Scanner;

public class P10_나머지 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.println( (a + b)%c );
        System.out.println( ((a%c)+(b%c))%c );
        System.out.println( (a * b)%c );
        System.out.println( ((a%c)*(b%c))%c );
        

    }
}


