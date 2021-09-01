package day01;

import java.util.Arrays;

/*n以内的素数：排除已知素数的倍数，那么剩下的就是素数。
1.令x为2
2.将2x、3x、4x直至ax<n的数标记为非素数
3.令x为下一个没有被标记的非素数的数，重复2，知道所有的数都已经尝试完毕
*/
public class PrimeNumber04 {
    public static void main(String[] args) {
        boolean[] isprime = new boolean[100];
        Arrays.fill(isprime,true);
        for ( int i = 2; i<isprime.length; i++){
            if ( isprime[i]){
                for ( int k = 2; i*k<isprime.length; k++){
                    isprime[i*k] = false;
                }
            }
        }
        int [] yayu = new int[isprime.length];
        int j = 0;
        for ( int i = 2; i<isprime.length; i++){
            if (isprime[i]){
                yayu[j] = i;
                System.out.print(yayu[j]+" ");
                j++;
            }
        }
    }
}
