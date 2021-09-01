package Exe;

import java.util.Scanner;

/*
对数字求特征值是常用的编码算法，奇偶特征是一种简单的特征值。
对于一个整数，从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。
这个整数在第n位上的数字记作x，如果x和n的奇偶性相同，则记下一个1，否则记下一个0。
按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，就形成了一个二进制数字。
比如，对于342315，这个二进制数字就是001101。
 */

public class T3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int i, result = 0, strLen = inputString.length();
        for(i=0;i<strLen;i++){
            System.out.print(inputString.charAt(i) + " ");
//            if((inputString.charAt(i) - '0' - strLen + i) % 2 ==0 ){
            if((inputString.charAt(i) - strLen + i) % 2 ==0 ){
//            if((inputString.charAt(inputString.length() - 1) + i) % 2 ==0 ){
                result = (result<<1) | 1;
            }else{
                result = (result<<1) | 0;
            }
//            System.out.print(result + " ");
        }
        System.out.println(result);
    }
}







