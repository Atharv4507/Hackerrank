import java.security.MessageDigest;
import java.util.Scanner;

/**
 * h58MessegeDigest_SHA256
 */
public class h58MessegeDigest_SHA256 {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Password: ");
            String s = sc.nextLine();
            sc.close();
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(s.getBytes("UTF-8"));
            byte[] by = md.digest();
            for (byte b : by) {
                System.out.printf("%02x",b);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }
}