package day01;

import java.util.Scanner;

//输入一个数，输出这个数是几位数和它的倒数，n%10取个位，n/10去个位

public class CountBackwords {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        int count = 0;
        int result = 0;
        n = in.nextInt();
        do
        {
            int a = n % 10;
            result = result*10 + a;
            System.out.println(a);
            count++;
            n = n / 10;
        }while (n>0);
        System.out.println("输入数的是："+count + "位数," + "它的倒数是:" + result);
    }
}
