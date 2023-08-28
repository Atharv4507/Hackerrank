import java.util.Scanner;
public class h5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            try {
                double c = Math.pow(2, 32);
                double d = Math.pow(2, 64);
                long a = sc.nextLong();
                if (-128<=a && a<=127) {
                    System.out.println("*byte");
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                }
                if (Short.MIN_VALUE<=a && a<=Short.MAX_VALUE) {
                    System.out.println("*short");
                    System.out.println("*int");
                    System.out.println("*long");
                }
                if (-c<=a&&a<=c) {
                    System.out.println("*int");
                    System.out.println("*long");
                }
                if (-d<=a&&a<=d) {
                    System.out.println("*long");
                }
            } catch (Exception e) {
                System.out.println("out of bond,reduce number size.");
            }
            
        }
        sc.close();
    }
}
