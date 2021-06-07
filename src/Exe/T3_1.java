package Exe;

import java.util.Scanner;

//奇偶数

public class T3_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int odd_number = 0;
        int even_number = 0;
        while ( n != -1 ){
            if ( n > 0 && n <100000 ){
                if ( n % 2 != 0 ){
                    odd_number++;
                }
                else {
                    even_number++;
                }
            }
            n = in.nextInt();
        }
        System.out.println( odd_number + " " + even_number );
    }
}







