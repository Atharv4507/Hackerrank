import java.util.Scanner;

public class h16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String [] splStrings = s.split("\\W+"); //togetWord in sentence in a line each  at a time.
        for (String string : splStrings) {
            System.out.println(string);
        }
        System.out.println();

        String [] splStrings3 = s.split("\\s+"); //togetWord with symbols
        for (String string : splStrings3) {
            System.out.println(string);
        }
        System.out.println();

        String [] splStrings2 = s.split("[\\s?]+");//except "?" all symbol see
        for (String string : splStrings2) {
            System.out.println(string);
        }
        System.out.println();
        
        String [] splStrings4 = s.split(""); // each letter at a line
        for (String string : splStrings4) {
            System.out.println(string);
        }
        
        System.out.println();
        sc.close();
    }
}
