import java.io.BufferedReader;
import java.io.InputStreamReader;

public class h28_powerof2 {

    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class
                     // h28_powerof2.Inner.Private
            h28_powerof2.Inner inner = new h28_powerof2.Inner();
            o = inner.new Private();
            System.out.println(num + " is " + ((h28_powerof2.Inner.Private) o).powerof2(num));
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");

        } // end of try

        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }// end of main

    static class Inner {
        private class Private {
            private String powerof2(int num) {
                return ((num & num - 1) == 0) ? "power of 2" : "not a power of 2";
            }
        }
    }// end of Inner

}// end of h28_powerof2

class DoNotTerminate { // This class prevents exit(0)

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }

    public static void forbidExit() {
    }
}
