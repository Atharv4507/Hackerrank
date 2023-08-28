// import java.util.ArrayList;
// import java.util.Arrays;
import java.util.Scanner;

public class h15 {
    public static void main(String[] args) {

        // dont know why but it showes error for some cases.though the outhput is correct.
        // but by code 2 it gives all cases green signal.


        // code 1
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] splitString = s.replaceAll("^[\\W+\\s+]", "").split("[\\s!,.?_@']+");
        System.out.println(splitString.length);
        for (String string : splitString) {
            System.out.println(string);
        }




        //  "Code 2"
        // if (!sc.hasNext())
        // {
        //     System.out.println(0);
        // }
        // else 
        // {
        //     String input=sc.nextLine();
        //     String[]a = input.trim().split("[ !,?._'@]+");
        //     ArrayList<String>listOfStrings =new ArrayList<String>(Arrays.asList(a));
        //     System.out.println(listOfStrings.size());
      
        //     for(String str:listOfStrings){
        //         System.out.println(str);
        //     }    
        // }
        sc.close();
    }
}
