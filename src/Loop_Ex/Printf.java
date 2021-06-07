package Loop_Ex;

import java.util.Scanner;

public class Printf {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0.0;
        int sign = 1;
        System.out.println(Math.abs(1-1.0)< 1e-6);
        for ( int i = 1; i<=n; i++ ,sign = -sign)
        {
//            sum += 1.0/i;
            if ( i%2 ==1 )
            {
                sum += 1.0/i;
            }
            else
            {
                sum -= 1.0/i;
            }
        }
        System.out.println(sum);
        System.out.printf("%.2f",sum);
    }
}
