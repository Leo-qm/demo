import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入三个数：");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        int max = 0;
        //输入三个数
        if ( x > y )
        {
            if ( x > z)
            {
                max = x;
            }
            else
            {
                max = z;
            }
        }
        else
        {
            if ( y > z )
            {
                max = y;
            }
            else
            {
                max = z;
            }
        }
        System.out.println(max);
    }
}
