import java.util.Scanner;
import java.util.regex.Pattern;

public class h18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int text = sc.nextInt();
        while (text>0) {
            text--;
            String s = sc.nextLine();
            try {
                Pattern.compile(s);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
        }
        sc.close();
    }
}
