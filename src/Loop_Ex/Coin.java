package Loop_Ex;

import java.util.Scanner;

public class Coin {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        OUT:
        for ( int one = 0; one <= amount; one++)
        {
            for ( int five = 0; five <= amount/5; five++)
            {
                for ( int ten = 0; ten <= amount/10; ten++)
                {
                    if ( one+five*5+ten*10 == amount )
                    {
                        System.out.println(one+"张1元，"+five+"张5元，"+ten+"张10元");
//                        break OUT;
                    }
                }
            }
        }
    }
}
