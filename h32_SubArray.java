import java.util.Scanner;

public class h32_SubArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int num = sc.nextInt();
        int n[] = new int[num];
        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();

        }
        int count = 0;
        for (int i = 0; i < num; i++) {
            if (n[i]<0) {
                count++;
            }
            for (int j = i+1; j < num; j++) {
                n[i] += n[j];
                if (n[i]<0) {
                    count++;
                }
            }
            // System.out.println(count);
        }
        System.out.println("There are "+count+" Negative SubArrays");
        sc.close();
    }
}
