public class max{
    public static void main(String[] args) {
        int [] arr={2,6,1,12,4,5,3,9,8};
        int Max=0;
        int Min=0;

        for (int i =1;i< arr.length;i++){
            if(arr[i]>Max){
            Max = arr[i];
            }else if(arr[i]<Max && arr[i]>Min){
                Min = arr[i];
            }
        }
        System.out.println("Max" + Min);
        System.out.println("Min" + Max);
    }
}
