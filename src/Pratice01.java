//题目内容：
//
//        写一个将华氏温度转换成摄氏温度的程序，转换的公式是：
//
//        °F = (9/5)*°C + 32 ==>°C = （F - 32）/(9/5)
//
//        其中C表示摄氏温度，F表示华氏温度。
//
//        程序的输入是一个整数，表示华氏温度。输出对应的摄氏温度，也是一个整数。
//
//        提示，为了把计算结果的浮点数转换成整数，需要使用下面的表达式：
//
//        (int)x;
//
//        其中x是要转换的那个浮点数。

import java.util.Scanner;

public class Pratice01 {
    public static void main(String[] args) {
        int f = 0;
        Scanner in = new Scanner(System.in);
        f = in.nextInt();
        System.out.println((int)((f-32)/(9/5.0)));
    }
}

//        //定义华氏摄氏度df为整数
//        int df;
//        //构建一个Scanner的对象，读取程序的用户的输入，然后让它来做各种形式的读的动作。
//        Scanner in = new Scanner(System.in);
//        //定义变量
//        df = in.nextInt();
//        //计算并输出结果
//        System.out.println((int)((df - 32)/(9/5.0)));
//    }
//}



