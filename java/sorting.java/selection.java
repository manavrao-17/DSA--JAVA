public class selection {
    public static void selectionsort(int [] arr) {
        int n = arr.length;
        //repeat ( n -1)times
        for(int i =0 ; i < n-1;i++){
        //set the first index unsorted elements
        int minIndex =i;
        //for each of the unsorted elements
        for(int j=i + 1;j<n;j++){
            //if elements < currentMinium
            if (arr[j] < arr[minIndex]){
                //set element as a new minimum
                minIndex=j;

            }
        }
        //swap minimum with first unsorted position
        int temp = arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=temp;
    }
    //print sorted array
    System.out.println("Sorted array:");
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
        selectionsort(array);
    
}
}
