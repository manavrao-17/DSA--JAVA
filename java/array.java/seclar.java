public class seclar {
    public static void main(String[] args) {
        int[] arr = {8,16,17,28,30};
        int max = Integer.MIN_VALUE, secoundMax = Integer.MIN_VALUE;
        for(int num : arr){
            if(num > max){
                secoundMax =max;
                max = num;
            }else if (num > secoundMax && num != max){
                secoundMax = num;
            }
        }
        System.out.println("Secound  Largest =" + secoundMax);
    }
}
