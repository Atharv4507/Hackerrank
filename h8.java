import java.util.Scanner;

public class h8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        try {
            if (n==Integer.parseInt(s)) {
                System.out.println("good");
            }
            else{
                System.out.println("wrong ans");
            }
        } catch (Exception e) {
            System.out.println("404");
        }
        sc.close();
    }
}
