package day01;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int result = 1;
//        int i = 1;
//        while (i<=n)
//        {
//            result = result*i;
//            i++;
//        }
        for (int i = 1; i<=n; i++)
        {
            result = result*i;
        }
        System.out.println(result);
    }
}
