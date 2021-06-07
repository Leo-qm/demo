import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int type = in.nextInt();
        //不加break会继续执行下一个case，直到遇到break退出，或所有case都不符合最后执行default
        switch ( type ){
            case 1:
                System.out.println("x=1");
            case 2:
                System.out.println("x=2");
                break;
            case 3:
                System.out.println("x=3");
                break;
            default:
                System.out.println("x");
        }
    }
}
