import java.util.Scanner;
import java.util.Stack;

public class h10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String i = sc.next();
            System.out.println(checkIfBalanced(i, '{', '}')&&
                               checkIfBalanced(i, '[', ']')&&
                               checkIfBalanced(i, '(', ')'));
        }
        sc.close();
    }
    
    // private static boolean checkIfBalanced(String i, String string, String string2) {
    //     return false;
    // }

    public static boolean checkIfBalanced(String i, char opening, char closing) {
        Stack<String> stack = new Stack<String>();
        for (int j = 0; j < i.length(); j++) {
            char c = i.charAt(j);
            if (c == closing)
             {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    return false;
                }
            } 
            else if (c == opening) 
            {
                stack.push(String.valueOf(c));

            }
        }
        return stack.empty(); 
    }

}

