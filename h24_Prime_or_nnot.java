import java.math.BigInteger;
import java.util.Scanner;

public class h24_Prime_or_nnot {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a num: ");
        BigInteger integer = sc.nextBigInteger();
        System.out.println(integer.isProbablePrime(1) ? "prime" : "not prime");
        sc.close();
    }
}
