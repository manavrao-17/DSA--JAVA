// searching array element
import java.util.*;
public class src {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the size of the array");
        //int n = sc.nextInt();
        //int arr[] = new int[n];
        //System.out.println("Enter the elements of the array");
        //for (int i = 0; i < n; i++) {
          //  arr[i] = sc.nextInt();
        //}
        //System.out.println("Enter the element to be searched");
        //int x = sc.nextInt();
       // linearSearch(arr, x);
    //}

   // static void linearSearch(int arr[], int x) {
        //for (int i = 0; i < arr.length; i++) {
           // if (arr[i] == x) {
               // System.out.println("Element found at index " + i);
              //  return;
          //  }
        //}
        //System.out.println("Element not found");
    


int arr[]={8,16,17,28,30};
int key =6;
int index=0;
for(int i=0;i<arr.length;i++){
    if (arr[i]==key){
        index=i;
    }

}
System.out.println(index);
    }
}
