package Array;

import java.util.Scanner;

//判断输入的数字是否在数组中
public class FindElement {
    public static void main(String[] args) {
//      for-each循环  适合list
        Scanner in = new Scanner(System.in);
        int[] data = {2, 4, 6, 8};
        boolean indeed = false;
        int n = in.nextInt();
        for (int i : data ) {
            if (n == i) {
                indeed = true;
                System.out.println( n + "在其中" );
                break;
            }
        }
        if (!indeed) {
            System.out.println( n + "不在其中" );
        }

//        for循环   适合array
//        Scanner in = new Scanner(System.in);
//        int[] data = {2, 4, 6, 8};
//        boolean indeed = false;
//        int n = in.nextInt();
//        for (int i = 0; i < data.length; i++) {
//            if (n == data[i]) {
//                indeed = true;
//                System.out.println(n + "是第" + (i + 1) + "个");
//                break;
//            }
//        }
//        if (!indeed) {
//            System.out.println(n + "不在其中");
//        }
    }
}
