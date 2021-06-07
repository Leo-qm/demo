import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        //TODO
        Scanner in = new Scanner(System.in);
//        int amount = in.nextInt();
        int balance = 0;
//        double a = 1.0;
//        double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
//        System.out.println(a == b);
//        System.out.println("a=" + a + ",b=" + b);
//        System.out.println(amount);
//        System.out.println(amount >= 10);
//        System.out.println(Math.abs(a - b) < 1e-6);
        while (true)
        {
            //输入金额
            System.out.print("请投币：");
            int count = in.nextInt();
            balance = balance + count;
            if (balance >= 10)
            {
                //打印车票
                System.out.println("-----------");
                System.out.println("-   起点   -");
                System.out.println("-   终点   -");
                System.out.println("- 票价：10元-");
                System.out.println("-----------");
                //计算并打印找零
                System.out.println("找零：" + (balance - 10));
                balance = 0;
            }
        }
    }
}
