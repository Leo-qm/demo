import java.util.Scanner;

public class pernum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num;
        int result = 0;
        num = in.nextInt();
        do {
            int a = num % 10;
            result = result*10 + a;
            System.out.println(a);
            num = num / 10;
        } while (num > 0);
        System.out.println(result);
    }
}
