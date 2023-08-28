import java.util.Scanner;
public class h13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A;
        do{
            A = sc.nextLine();
            if (A.charAt(0)==A.charAt(A.length()-1)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }while(A!="end");
        sc.close();
    }
}