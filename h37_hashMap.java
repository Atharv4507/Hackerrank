import java.util.HashSet;
import java.util.Scanner;

public class h37_hashMap {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        String PL[] = new String[n];
        String PR[] = new String[n];
        for (int i = 0; i < n; i++) {
            PL[i] = sc.next();
            PR[i] = sc.next();
        }
        HashSet<String> h = new HashSet<>();
        for (int i = 0; i < n; i++) {
            h.add(PL[i]+"#"+PR[i]);
            System.out.println(h+" "+h.size());
        }
        sc.close();
    }
}
