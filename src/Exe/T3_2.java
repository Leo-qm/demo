package Exe;

import java.util.Scanner;

//奇偶数

public class T3_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = 0;
        while ( n != -1 ){
            if ( n > 0 && n <100000 ){
                if ( n % 2 != 0 ){
                    num++;
                }
            }
            n = in.nextInt();
        }
        System.out.println( );
    }
}







