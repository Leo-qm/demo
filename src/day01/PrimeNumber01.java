package day01;


//100内的素数
public class PrimeNumber01 {
    public static void main(String[] args) {
        for (int n = 2; n <= 100; n++) {
            boolean isprime = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isprime = false;
                    break;
                }
            }
            if (isprime) {
                System.out.print(n + " ");
            }
        }
    }
}



