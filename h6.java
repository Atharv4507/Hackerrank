import java.util.Scanner;

public class h6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Enter no.:");
        while (sc.hasNext()) {
            String s = sc.nextLine();
            System.out.println("Id No.: "+i+" your No.: "+s);
            i++;
        }
        sc.close();
    }
}
