public class tagert {
    public static void main(String[] args) {
        int []  arr={8,16,17,28,30};
        int tagert= 17;
        boolean found = false;
        for (int num : arr){
            if (num == tagert){
                found = true;
                break;
            }
        }
        System.out.println("found:"+ found);
    }
}
