//E COMMERCE DISCOUNT CALCULATOR
//member & cart>5000-20%
//member & cart<5000-10%
//not a member-5%
import java.util.Scanner;
public class cart{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the membership true or false");
        boolean member = sc.nextBoolean();


        System.out.println("Enter the rs");
        float cart = sc.nextFloat();
        float result ;

        if (cart > 5000 && member == true) {

            result = (cart * 20/100) ;
            System.out.println("Discount : " + result);
            
        } else if (cart <= 5000 && member == true) {
            
             result = (cart * 10/100) ;
            System.out.println("Discount : " + result);
            
            
        } else if (member == false) {
            
             result = (cart * 5/10) ;
            System.out.println("Discount : " + result);
        }
            
        sc.close();
    

    }
}          
   