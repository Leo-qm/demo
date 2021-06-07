package Loop_Ex;

import java.util.Scanner;


public class Gcd {
    public static void main(String[] args) {
//        //f = 1+....1/n
//        Scanner in = new Scanner(System.in);
//        double sum = 0.0;
//        int n = in.nextInt();
//        int sign = 1;
//        for (int i = 1; i <= n; i++, sign = -sign)
//        {
//             if ( i%2 == 1 ){
//                 sum += 1.0 / i;
//             }
//             else{
//                 sum -= 1.0 / i;
//             }
//
//        }
//        System.out.printf("%.2f",sum);


////        最大公约数greatest common divisor，
////        两数比较，一个变量记录公约数，保留最大
//        Scanner in = new Scanner(System.in);
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int gcd = 1;
//        for (int i = 2; i <= a && i <= b; i++)
//        {
//            if (a % i == 0 && b % i == 0)
//            {
//                gcd = i;
//            }
//        }
//        System.out.println(a+"和"+b+"的最大公约数是："+gcd);


//        辗转相除法：有a、b两个数
//        1. 如果b=0，计算结束，a就是最大公约数
//        2. 否则，计算a/b的余数，让a=b，而b等于那个余数
//        3. 回到第一步
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int oa = a;
        int ob = b;
        while (b!=0){
            int i = a%b;
            a = b;
            b = i;
        }
        System.out.println(oa+"和"+ob+"的最大公约数是："+a);
    }
}
