package 단계별문제.c01_입출력과사칙연산;
/**
 * 곱셈
 * @author mynote
 *
 */
import java.util.Scanner;

public class P11_곱셈 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int i1 = b / 100;
        int i2 = ( b - i1 * 100) /10;
        int i3 = b - i1 * 100 - i2 * 10;
                
        System.out.println( a * i3 );
        System.out.println( a * i2 );
        System.out.println( a * i1 );
        System.out.println( a * b);
        

    }
}


