import java.util.Scanner;
//
//5尺7寸是多少米？
//第一种解法：将除数化为浮点数 12==>12.0
//第二种解法：将被除数化为浮点数 int==>double
public class Transform {
    public static void main(String[] args){
        int foot;
//        int inch;
        double inch;
        foot = (int)(30/3.0);
        System.out.println(1.2-1.1);
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextInt();
//        inch = in.nextDouble();
//        System.out.println("foot=" + foot + ",inch=" + inch);
        System.out.println("foot=" + foot + "," + "inch=" + inch);
//        System.out.println((foot + inch/12.0) * 0.3048);
        System.out.println((int)((foot + inch/12) * 0.3048*100) + "cm");
    }
}



