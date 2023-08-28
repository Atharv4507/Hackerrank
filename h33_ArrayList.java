import java.util.ArrayList;
import java.util.Scanner;

public class h33_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of lines you want: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<ArrayList> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter How many index you want for "+i+" row : ");
            int numOfIndex = sc.nextInt();
            ArrayList<Integer> AA = new ArrayList<Integer>();
            System.out.print("Enter Array: ");
            for (int j = 1; j <= numOfIndex; j++) {
                AA.add(new Integer(sc.nextInt()));
            }
            A.add(AA);
            sc.nextLine();
        }
        System.out.println("You Selected "+n+" Arrays.");
        System.out.print("Enter How many query you want to fire: ");
        int numOfQueries = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= numOfQueries; i++) {
            System.out.print("Enter the No of array which you want to select: ");
            int x = sc.nextInt()-1;
            System.out.print("Enter the Index In that array you want: ");
            int y = sc.nextInt()-1;
            sc.nextLine();
            if (x<A.size() && y<A.get(x).size()) {
                System.out.println(A.get(x).get(y));
            } else {
                System.out.println("ERROR!");
            }
        }
        sc.close();
        A.clear();  
    }
}
