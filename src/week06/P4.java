package week06;

import java.util.Scanner;

public class P4 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        String s1 = "abc";
        String s2 = "abb";
        String s3 = "abcd";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println("abcd".compareTo(s3));
    }
}