///bublesort code 
public class bubblesort{
    
    public static void bubblesort(int[] arr) {
        boolean swapped;
        int n = arr.length;
        do {
            swapped = false;
            for (int i=0; i<n-1; i++) {
                if (arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;

                    swapped = true;
                }
            }
            n--; //Reduce the unsorted array size
        }while  (swapped);
        System.out.println("Sorted array: ");
        for (int num :  arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }   
    public static void main(String[] args) {
        int[] arr = {30,17,8,16,28};
        System.out.println("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        bubblesort(arr);
    }
}