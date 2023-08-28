import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
    String UserRole() default "Guest";

    int BudgetLimit() default 0;
}

class FamilyMember {
    @FamilyBudget(UserRole = "SENIOR", BudgetLimit = 100)
    public void seniormember(int budget, int moneyspent) {
        System.out.println("Senior Member");
        System.out.println("Spent: " + moneyspent);
        System.out.println("Budget left: " + (budget - moneyspent));
    }

    @FamilyBudget(UserRole = "JUNIOR", BudgetLimit = 50)
    public void juniormember(int budget, int moneyspent) {
        System.out.println("Junior Member");
        System.out.println("Junior: " + moneyspent);
        System.out.println("Budget left: " + (budget - moneyspent));
    }
}

public class h60Annotations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter how many time you have to check: ");
        int testcase = Integer.parseInt(in.nextLine());
        System.out.println("Enter SENIOR/JUNIOR and amount they spend:");
        while (testcase > 0) {
            String role = in.next();
            int spent = in.nextInt();

            try {
                Class annotation = FamilyMember.class;
                Method method[] = annotation.getMethods();

                for (Method method2 : method) {

                    if (method2.isAnnotationPresent(FamilyBudget.class)) {
                        FamilyBudget family = method2.getAnnotation(FamilyBudget.class);
                        String userRole = family.UserRole();
                        int budgetLimit = family.BudgetLimit();

                        if (userRole.equals(role)) {

                            if (budgetLimit >= spent)
                            {
                                method2.invoke(FamilyMember.class.newInstance(), budgetLimit, spent);
                            } 
                            else 
                            {
                                System.out.println("Budget Limit Over");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
            }
            testcase--;
        }
        in.close();
    }
}
