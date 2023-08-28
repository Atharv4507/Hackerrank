import java.util.*;

public class h41_Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        System.out.println("Enter details below that how many number(M) you want and subset you want(N)?");
        System.out.println("M       N");
        int n = in.nextInt();
        int m = in.nextInt();
        int ans = 0, distinct = 0;
        System.out.println("start Entering no in 'TAB'");
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.addLast(num);
            if (hashmap.get(num) == null)
                hashmap.put(num, 0);

            hashmap.put(num, hashmap.get(num) + 1);

            if (hashmap.get(num) == 1)
                distinct++;

            if (deque.size() == m + 1) {
                int ele = deque.removeFirst();
                hashmap.put(ele, hashmap.get(ele) - 1);
                if (hashmap.get(ele) == 0)
                    distinct--;
            }
            if (deque.size() == m) {
                if (distinct > ans)
                    ans = distinct;
            }

        }
        System.out.println("Unique no in a set are: ");
        System.out.println(ans);
        in.close();
    }
}