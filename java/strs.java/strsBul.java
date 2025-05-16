//how to reverse a string
public class strsBul {
    public static void main(String[] args) {
        StringBuilder mj = new StringBuilder("Test");
        //Method One
        //System.out.println(mj.reverse());

        //Method Two
        for (int i =mj.length()-1;i>=0;i--){

            System.out.println(mj.charAt(i));
        }
    }
}
