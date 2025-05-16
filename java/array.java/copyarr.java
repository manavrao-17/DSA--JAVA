
import java.util.*;

public class copyarr {
    public static void main(String[] args) {
        int[] arr1 = {8,16,17,28,30};
        int [] arr2 = new int[arr1.length];
        for (int i = 0;i < arr1.length;i++){
            arr2[i] = arr1[i];
        }
        System.out.println("Copied Array:" + Arrays.toString(arr2));
    }
}
