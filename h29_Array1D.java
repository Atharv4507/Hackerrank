import java.util.Scanner;

public class h29_Array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for lines you want: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("Your array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
