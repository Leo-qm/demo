package Exe;

import java.util.Scanner;

//

public class T2_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int R = n / 10;
        int S = n % 10;
        if ( n >= 11 && n <= 59 ) {
            //不加break会继续执行下一个case，直到遇到break退出，或所有case都不符合最后执行default
            switch ( S ){
                case 1:
                    System.out.print("Faint signals, barely perceptible,");
                    break;
                case 2:
                    System.out.print("Very weak signals,");
                    break;
                case 3:
                    System.out.print("Weak signals,");
                    break;
                case 4:
                    System.out.print("Fair signals,");
                    break;
                case 5:
                    System.out.print("Fairly good signals,");
                    break;
                case 6:
                    System.out.print("Good signals,");
                    break;
                case 7:
                    System.out.print("Moderately strong signals,");
                    break;
                case 8:
                    System.out.print("Strong signals,");
                    break;
                case 9:
                    System.out.print("Extremely strong signals,");
                    break;
                default:
                    break;
            }
            switch ( R ) {
                case 1:
                    System.out.println("unreadable.");
                    break;
                case 2:
                    System.out.println("barely readable, occasional words distinguishable.");
                    break;
                case 3:
                    System.out.println("readable with considerable difficulty.");
                    break;
                case 4:
                    System.out.println("readable with practically no difficulty.");
                    break;
                case 5:
                    System.out.println("perfectly readable.");
                    break;
                default:
                    break;
            }
        }
    }
}







