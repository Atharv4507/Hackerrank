import java.util.Scanner;

public class h34_array1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. of query you want to do: ");
        int q = sc.nextInt();
        while (q-- >0) {
            System.out.print("Enter size of game: ");
            int n = sc.nextInt();
            System.out.print("Enter leap: ");
            int leap = sc.nextInt();
            int [] game = new int[n];
            System.out.print("Enter game: ");
            for (int i = 0; i < n; i++) {
                game[i] = sc.nextInt();
            }
            System.out.println((CanWin(leap, game)) ? "Yes,you can win." : "No,you can't win.");
        }
        sc.close();
    }
    public static boolean CanWin(int leap,int[] game) {
        return isSolvable(leap, game, 0);
    }
    public static boolean isSolvable(int m,int[] arr,int i) {
        if (i<0 || arr[i]==1) return false;
        if (i == arr.length-1 || i+m==arr.length-1) return true;
        return isSolvable(m, arr, i-1) || isSolvable(m, arr, i+1) || isSolvable(m, arr, i+m);
    }
}
