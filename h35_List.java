import java.util.ArrayList;
import java.util.Scanner;

public class h35_List {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> AA = new ArrayList<Integer>();
        System.out.print("Enter Elements: ");
        for (int i = 0; i < n; i++) {
            AA.add(sc.nextInt());
        }
        System.out.print("How many queries you want to fire: ");
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            System.out.print("Enter  Quri: ");
            String s = sc.nextLine();
            if (s.equals("Insert")) {
                System.out.print("Enter index: ");
                int x = sc.nextInt();
                System.out.print("Enter Number: ");
                int y = sc.nextInt();
                AA.add(x, y);
            }
            else{
                System.out.print("Enter index: ");
                int x = sc.nextInt();
                AA.remove(x);
            }
        }
        System.out.print("Now Your array is: ");
        for (Integer numInteger : AA) {
            System.out.print(numInteger+" ");
        }
        sc.close();
    }
}
