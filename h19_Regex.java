import java.util.Scanner;

public class h19_Regex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String ip = sc.next();
            System.out.println(ip.matches(new MyRegex().pattern));
        }
        sc.close();
    }
    
}
class MyRegex{
    public String pattern="([1][\\d][\\d]|[0][0][0]|([0]|)[\\d][\\d]|([0][0]|)[\\d]|[2][0-4][\\d]|[2][5][0-5])."+
                          "([1][\\d][\\d]|([0]|)[\\d][\\d]|([0][0]|)[\\d]|[2][0-4][\\d]|[2][5][0-5])."+
                          "([1][\\d][\\d]|([0]|)[\\d][\\d]|([0][0]|)[\\d]|[2][0-4][\\d]|[2][5][0-5])."+
                          "([1][\\d][\\d]|([0]|)[\\d][\\d]|([0][0]|)[\\d]|[2][0-4][\\d]|[2][5][0-5])" ;
}
