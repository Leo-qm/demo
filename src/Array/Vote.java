package Array;

import java.util.Scanner;

//给0~9号投票，输入投票号码，当输入-1时退出，输出每号得票数：需构建一个数组，Scanner输入
public class Vote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] num = new int[10];
        int n = in.nextInt();
        while ( n != -1 )
        {
            if ( n >= 0 && n <= 9)
            {
                num[n]++;
            }
            n = in.nextInt();
        }
//        for (int i : num)
//        {
//            System.out.println(i);
//        }
        for (int i = 0; i<num.length; i++)
        {
            System.out.println(i+"得票:"+num[i]);
        }
    }
}





//        int n = in.nextInt();
//        int [] num = new int[10];
//        while ( n != -1 )
//        {
//            if ( n>=0 && n<=9 )
//            {
//                num[n]++;
//            }
//            n = in.nextInt();
//        }
//        for (int i = 0; i<num.length; i++)
//        {
//            System.out.println(i+"得票:"+num[i]);
//        }
//    }
//}
