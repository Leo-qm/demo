package week07;

public class P2 {
    public static void sum(int a, int b) {
        int i;
        int sum;
        sum = 0;
        for ( i = a; i<=b; i++ ) {
            sum += i;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum(1,3);
    }
}