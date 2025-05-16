import java.util.*;
public class binary {
    public static int binsearch(int[] arr,int key) {
        int low = 0, high = arr.length-1;
        while(low <= high){
            int mid = low + high/2;

            if(arr[mid]==key){
                return mid;
            }else if(arr[mid]<key){
                low=mid+1;
            }else{
                high =mid -1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10,20,30,40,50,60};
        int key=40;
        int result = binsearch(data, key);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index");
        }
        }
    }

