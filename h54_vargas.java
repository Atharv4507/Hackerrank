import java.io.*;
import java.lang.reflect.*;
import java.util.*;

class Add {
    static void add(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (sum != 0) {
                System.out.print("+");
            }
            sum += num;
            System.out.print(num);
        }
        System.out.println("=" + sum);
    }
}

public class h54_vargas {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter no.: ");
            int n1 = Integer.parseInt(br.readLine());
            System.out.print("Enter no.: ");
            int n2 = Integer.parseInt(br.readLine());
            System.out.print("Enter no.: ");
            int n3 = Integer.parseInt(br.readLine());
            System.out.print("Enter no.: ");
            int n4 = Integer.parseInt(br.readLine());
            System.out.print("Enter no.: ");
            int n5 = Integer.parseInt(br.readLine());
            System.out.print("Enter no.: ");
            int n6 = Integer.parseInt(br.readLine());
            Add ob = new Add();
            ob.add(n1, n2);
            ob.add(n1, n2, n3);
            ob.add(n1, n2, n3, n4);
            ob.add(n1, n2, n3, n4, n5);
            ob.add(n1, n2, n3, n4, n5, n6);
            Method[] methods = Add.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
