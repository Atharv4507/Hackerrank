// import java.util.*;
// public class h50_iterator{

//     public static void main(String []args){
//         ArrayList<String> mylist = new ArrayList<>();
//         mylist.add("Hello");
//         mylist.add("Java");
//         mylist.add("4");
//         Iterator<String> it = mylist.iterator();
//         while(it.hasNext()){
//             Object element = it.next();
//             System.out.println(element);
//         }
//     }
// }


import java.util.*;
public class h50_iterator{
	
   static Iterator<String> func(ArrayList<String> mylist){
      Iterator<String> it=mylist.iterator();
      while(it.hasNext()){
          
         Object element = it.next();
         if(element instanceof Integer){//Hints: use instanceof operator
            continue;
			
		}
        break;
   }
   return it;
}
//    @SuppressWarnings({ "unchecked" });
   public static void main(String []args){
      ArrayList mylist = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a no:");
      int n = sc.nextInt();
      System.out.print("Enter a no:");
      int m = sc.nextInt();
      System.out.println("Enter no upto value of n:");
      for(int i = 0;i<n;i++){
        mylist.add(sc.nextInt());
      }
      System.out.println("###");
      mylist.add("###");
      System.out.println("Enter no upto value of m:");
      for(int i=0;i<m;i++){
        mylist.add(sc.next());
      }
      System.out.println("Element after ### are:");
      Iterator<String> it=func(mylist);
      while(it.hasNext()){
        Object element = it.next();
        System.out.println((String)element);
      }
      sc.close();
   }
}
