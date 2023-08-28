import java.util.Scanner;
public class h21Username {
    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of lines: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n-- !=0) {
            String username = sc.nextLine();
            if (username.matches(Username.regulerExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }

    }
}
class Username{
    static final String regulerExpression = "^[a-zA-Z]{1,1}[a-zA-Z0-9_]{7,29}$";
}