import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Scanner;

/**
 * h57MessegeDigest
 */
public class h57MessegeDigest {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            MessageDigest md = MessageDigest.getInstance("MD5");
            System.out.print("Enter Password: ");
            byte[] by = md.digest(sc.nextLine().getBytes());
            sc.close();
            System.out.print("Your password in Messege Digest is: ");
            System.out.printf("%32x\n", new BigInteger(1,by));
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}