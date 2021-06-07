package day01;

//前50个素数
public class PrimeNumber02 {
    public static void main(String[] args) {
        int n = 2;
        int count = 0;
        while (count<50){
            boolean isprime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false
                    ;
                    break;
                }
            }
            if (isprime){
                count++;
                System.out.print(n+" ");
            }
            n++;
        }
        System.out.println(" ");
        System.out.println("素数个数："+count);
    }
}

//public class PrimeNumber02 {
//    public static void main(String[] args) {
//        int count = 0;
//        for (int n = 2;count<50;n++){
//            boolean isprime = true;
//            for (int i = 2; i < n; i++) {
//                if (n % i == 0) {
//                    isprime = false;
//                    break;
//                }
//            }
//            if (isprime){
//                count++;
//                System.out.print(n+" ");
//            }
//        }
//        System.out.println(" ");
//        System.out.println("素数个数："+count);
//    }
//}