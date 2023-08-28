import java.util.*;
public class h42_Bitset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many bits you want in both B1 and B2(M). Enter how many performance you want to do(N)");
        System.out.println("M       N");
        int bitSetSize = sc.nextInt();
        int numOperations = sc.nextInt();
        BitSet[] bitSetArray = new BitSet[2];       
        bitSetArray[0] = new BitSet(bitSetSize);
        bitSetArray[1] = new BitSet(bitSetSize);
        sc.nextLine();
        System.out.println("start Enterring inputes");
        System.out.println("oper    B1      B2");
        for(int i = 0;i < numOperations; i++)
        {
            String[] opArray = sc.nextLine().split(" ");
            switch(opArray[0]){
                case "AND": bitSetArray[Integer.parseInt(opArray[1])-1].and(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "OR": bitSetArray[Integer.parseInt(opArray[1])-1].or(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "XOR": bitSetArray[Integer.parseInt(opArray[1])-1].xor(bitSetArray[Integer.parseInt(opArray[2])-1]);
                break;
                case "FLIP": bitSetArray[Integer.parseInt(opArray[1])-1].flip(Integer.parseInt(opArray[2]));
                break;
                case "SET": bitSetArray[Integer.parseInt(opArray[1])-1].set(Integer.parseInt(opArray[2]));
                break;
            }
        }
        System.out.println("Your ans:");
        for (int i = 0; i < numOperations; i++) {
            System.out.println(bitSetArray[0].cardinality() + " " + bitSetArray[1].cardinality());
        }
        sc.close();
    }
}
