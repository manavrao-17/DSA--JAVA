import java.lang.Exception;
public class expp {
    public static void main(String[] args) {
        int arr[]={12,4,3,6};
        try{
            int result = 10/0; //this will throw ArithmeticException
        }catch (Exception e){
            System.out.println("cannot divide by zero!" +e);
        }finally{
        System.out.println("this block always runs");
        }
    }
}
