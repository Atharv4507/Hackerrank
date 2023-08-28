import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.*;

//Method 1**************************
class Prime {

    public void checkPrime(int... arguments){
        for (int num : arguments) {
            if (isPrime(num)) System.out.print(num + " ");
        }
        System.out.println("");
    }

    private boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

}


//Method 2******************************
// class Prime {
//  static void checkPrime(int...arr) {
//   for (int i = 0; i < arr.length; i++) {
//    boolean flag = false;
//    for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
//     if (arr[i] % j == 0) {
//      flag = true;
//      break;
//     }
//    }
//    if (arr[i] > 1 && (!flag || arr[i] == 2)) {
//     System.out.print(arr[i] + " ");
//    }
//   }
//   System.out.println();
//  }
// }


//Mehod 3***********************************
// class Prime {
//     public void checkPrime(int ... n) {
//         for (int j=0;j<n.length;j++) {
//                 int c = 0;
//                 for (int i=2;i<n[j];i++) {
//                     if (n[j]%i==0) {
//                         c++;
//                     }
//                 }
//                 if (c==0 && n[j]!=1) {
//                     System.out.print(n[j] + " ");
//                 }
          
//         }  System.out.println();
// }
// }

public class h30_isPrime{

	public static void main(String[] args) {
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
		Set<String> set=new HashSet<>();
		boolean overload=false;
		for(int i=0;i<methods.length;i++)
		{
			if(set.contains(methods[i].getName()))
			{
				overload=true;
				break;
			}
			set.add(methods[i].getName());
			
		}
		if(overload)
		{
			throw new Exception("Overloading not allowed");
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
