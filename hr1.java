import java.util.Scanner;

public class hr1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        double d =  sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: "+s);
        System.out.println("double: "+i);
        System.out.println("Int: "+d);
        sc.close();
    }
}