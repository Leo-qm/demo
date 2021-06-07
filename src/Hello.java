import java.util.Scanner;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("hee");
        Scanner in = new Scanner(System.in);
        System.out.println("echo:" + in.nextLine());
        int price = 0; //初始化
//        int amount = 0; //初始化
        final int amount = 100;//常量（final可以修饰变量，并在赋予初值后，不可以再改变）
        System.out.print("请输入票面：");
//        amount = in.nextInt();//表达式
        System.out.print("请输入金额：");
        price = in.nextInt();//表达式
        System.out.println(amount + "-" + price + "=" + (amount-price));
    }
}
