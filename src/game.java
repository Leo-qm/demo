import java.util.Scanner;

public class game {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = (int)(Math.random()*100+1);  //[0,1)-->[0,100)-->[0,101)=[0,100]
        int a = 0;
        int count = 0;
        do {
            a = in.nextInt();
            count = count +1;
            if (a > num)
            {
                System.out.println("偏大");
            }

            else if (a < num)
            {
                System.out.println("偏小");
            }
        } while (a != num);
        System.out.println("恭喜你猜对了，你猜了"+count+"次");
    }
}
