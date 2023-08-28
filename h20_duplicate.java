import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class h20_duplicate {
    public static void main(String[] args) {
        String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
        Scanner sc = new Scanner(System.in);
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.print("Enter a number of lines you want: ");
        int number = Integer.parseInt(sc.nextLine());

        while (number --> 0) {
            String input = sc.nextLine();
            Matcher m= p.matcher(input);
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
            System.out.println("Your phrase without duplicate word is: "+input);

        }
        sc.close();   
    }
}
