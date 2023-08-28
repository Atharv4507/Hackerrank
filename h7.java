import java.util.Scanner;

public class h7 {

    // ***Hackerrank solution***//

    // static Scanner sc = new Scanner(System.in);
    // static int B = sc.nextInt();
    // static int H = sc.nextInt();
    // static boolean flag = true;
    // static{
    //     if (B<0 || H<0) {
    //         System.out.println("Integers can't be negative");
    //         flag = false;
    //     }
    // }
    // public static void main(String[] args) {
    //     if (flag) {
    //         int area = B*H;
    //         System.out.println("Area of triangle is: "+area);
    //     }
    // }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bridth: ");
        int b = sc.nextInt();
        System.out.print("Enter height: ");
        int h = sc.nextInt();
        boolean flag = true;
        if (b<0||h<0) {
            System.out.println("Integers can't be negative");
            flag = false;
        }
        else if (flag) {
            int area = b*h;
            System.out.println("Area of triangle is: "+area);
        }
        sc.close();
    }
}
