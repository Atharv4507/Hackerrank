import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class h9 {
    public static void main(String[] args) {
        double a;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Amount: ");
            a = sc.nextDouble();
            
          
            NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
            String us  = n.format(a/80);

            NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN","Rs"));
            String india = n1.format(a);

            NumberFormat n2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china = n2.format(a/7);

            NumberFormat n3 = NumberFormat.getCurrencyInstance(Locale.UK);
            String UK = n3.format(a/100);

            
            System.out.println("us: "+us);
            System.out.println("India: "+india);
            System.out.println("China: "+china);
            System.out.println("Uk: "+UK); 
            System.out.println(); 
        }while(a!=0);  
        sc.close();
    }
}
