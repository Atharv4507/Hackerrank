import java.util.Scanner;

public class h12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        sc.close();
        System.out.println(getSL(s,k));
    }
    public static String getSL(String s,int k){
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0, k);

        for (int i = 0; i < s.length()-k+1; i++) {
            String su = s.substring(i, i+k);
            if (smallest.compareTo(su)>0) {
                smallest = su;
            }
            else if(largest.compareTo(su)<0){
                largest = su;
            }
            // else{
            //     System.out.println("404");
            // }
        }
        return smallest +"\n"+largest;
    }
}
