import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int len = sc.nextInt();
        int[] arr = new int[len];
        System.out.println("Enter the Elements in the array :");
        for(int i = 0 ; i < len ; i++){
            arr[i] = sc.nextInt();
        }
        
        int start = 0;
        int end = len -1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int i = 0 ; i < len ; i++){
            System.out.println(arr[i]);
        }
    }
}