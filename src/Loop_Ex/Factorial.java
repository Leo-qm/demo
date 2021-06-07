package Loop_Ex;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 1;
        int factor = 1;
//        while (i <= n)
//        {
//            factor = factor * i;
//            i = i+1;
//        }
        for (i=1; i<=n; i++)
        {
            factor = factor * i;
        }
        System.out.println(factor);
    }
}
