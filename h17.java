import java.util.Scanner;

// practice set for "h15","h16" tutorial.

// ********String FLIGHT_INPUT = "20221018LH720FRAPEK"************;
// Copy
// And we expect to get this array as a result:

// { "20221018", "LH720", "FRA", "PEK" }
// Copy
// Well, at the first glance, this conversion logic looks obscure. However, if we list the definition of the input string, we'll see why the array above is expected:

// [date][Flight number][Airport from][Airport to]
// - date: YYYY-MM-DD; length:8
// - Flight number; length: variable
// - Airport From: IATA airport code, length:3
// - Airport To: IATA airport code, length:3
// Copy
// As we can see, sometimes we need to parse the input string following a pretty special rule. In that case, we need to analyze the requirement and implement a parser

public class h17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String date = s.substring(0, 8);
        String FlightNo = s.substring(8, s.length()-6);
        int place = date.length()+FlightNo.length();
        String From = s.substring(place, place+3);
        String To = s.substring(place+3);
        String [] splStrings = {date,FlightNo,From,To};
        for (String string : splStrings) {
            System.out.println(string);
        }
        sc.close();
    }
}
