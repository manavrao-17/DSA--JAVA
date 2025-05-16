public class insertion {
    public static void insertionsort(int[] arr) {
        int n = arr.length;
        //mark first element as sorted
        for(int i = 1;i < n; i++){
            // extract the element X
            int key = arr[i];
            int j = i - 1;
            //move sorted elements to the right if they are greater than
            while (j >=0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            //insert X at the correct position
            arr[j + 1] = key;
        }
        //print the sorted array
        System.out.println("sorted array");
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
     public static void main(String[] args) {
        int[] array = {30,17,8,16,28};
        System.out.println("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        insertionsort(array);
    
}
}
