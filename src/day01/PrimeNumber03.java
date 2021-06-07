package day01;

import java.util.Scanner;

//前50个素数
public class PrimeNumber03 {
    public static void main(String[] args) {
        int[] primes = new int[50];
        primes[0] = 2;
        int cnt = 1;
        MAIN_LOOP:
        for ( int x = 3; cnt<50; x+=2 ){
            for ( int i = 0; i < cnt; i++ ){
                if ( x % primes[i] ==0 ){
                    continue MAIN_LOOP;
                }
            }
            primes[cnt++] = x;
        }
        for (int k : primes){
            System.out.print(k+" ");
        }
    }
}
