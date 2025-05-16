//check that string is palindrome
public class palindrome {
    public static void main(String[] args) {
        StringBuilder mj = new StringBuilder("test");
        StringBuilder az = new StringBuilder(mj);

        mj.reverse();
        //if(mj==az){
           // System.out.println("String is Palindrome");
       // }else{
           // System.out.println("string is not palindrome");
       // }
    boolean check=false;
    for (int i=0;i<mj.length();i++){
        if(mj.charAt(i)==az.charAt(i)){
            check=true;
        }else{
            check=false;
            break;
        }
    }
    System.out.println(check);
}
}