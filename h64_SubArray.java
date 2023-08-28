import java.util.Scanner;

class h64_SubArray{
    public static int SubarraySum(int array[], int N, int sum){
        int current_sum, i, j;
        //picking up a starting point
        for (i = 0; i < N; i++){
            current_sum = array[i];
            //try out all the subarrays which starts with i 
            for (j = i+1; j < N + 1; j++){
                //Return start and end index of subarray which have sum equal to given sum
                if (current_sum == sum){
                    System.out.println("Subarray with given sum is between indexes " + i + " and " + (j-1)); 
                    return 1;
                }
                else if (current_sum > sum){
                    break;
                }
               current_sum = current_sum + array[j];
            }
        }
        //if no such subarray found 
        System.out.println("Subarray with given sum is NOT Found");
        return 0;
    }
    public static void main(String[] args){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number for array's length: ");
        int n = sc.nextInt();
        System.out.println("Enter 'sum' number: ");
        int sum = sc.nextInt();
        System.out.print("Enter array:");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        SubarraySum(a,n,sum);
        sc.close();
    }
}

