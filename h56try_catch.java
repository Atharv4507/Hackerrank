import java.util.InputMismatchException;
import java.util.Scanner;

public class h56try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            try {
                System.out.print("Enter no.: ");
                int x = sc.nextInt();
                System.out.print("Enter no.: ");
                int y = sc.nextInt();
                System.out.println(""+(x/y));
            } catch (InputMismatchException e) {
                System.out.println("Java.util.MismatchException");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}
