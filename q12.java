// DAY 3
//Find the sum of the first n natural numbers using a loop.
public class q12 {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for ( int i = 1 ; i <= n; i++ ) {
            sum += i;
        }
        System.out.println(sum);
    }
}
