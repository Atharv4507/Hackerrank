import java.util.Scanner;

public class h63Duplicate_words2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = "yes";
        System.out.println("Enter Yes or No");
        String a = sc.nextLine();
        
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Yes");
        }        
        else{
            System.out.println("NO");
        }
        System.out.println(a.compareToIgnoreCase(b));
        String p = "72234";
        String q = "453221";
        System.out.println(p.compareToIgnoreCase(q));
        sc.close();
    }
}
