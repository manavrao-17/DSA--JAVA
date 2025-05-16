
//validate recharge amount:min-10,max-5000 and must be multiple of 10            
import java.util.Scanner;

public class moblie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Recharge amount");

        int rechargeAmount = scanner.nextInt();

        if (rechargeAmount >= 10 && rechargeAmount <= 5000) {

            if (rechargeAmount % 10 == 0)
            System.out.println("Recharge Successfull");
            else
            System.out.println("Enter The Multiple Of Rs.10: ");
            }

        else
        System.out.println("Recharge amount is not valid");
    } 
}
