package Exe;

import java.util.Scanner;

//BJT%10取个位，BJT/10去个位

public class T2_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int UTC = in.nextInt();
        if ( UTC >= 0 && UTC <=2359 ){
            if ( (UTC / 100  >= 8 ) ){
               System.out.println(UTC-800);
            }
            else {
                System.out.println(UTC+1600);
            }
        }
    }
}







