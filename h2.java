import java.util.Scanner;

public class h2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1;
        int x;
        System.out.println("================================");
        for(int i=0;i<3;i++){
            s1=sc.next();
            x=sc.nextInt();
            System.out.printf("%-14s %03d\n",s1,x);
                //Complete this line
        }
        System.out.println("================================");
        sc.close();
    }
}
