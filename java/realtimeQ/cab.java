//cab fare estimator
//estimate fare: -peak(17-21hrs):$20/km,Else:$15/km
import java.util.Scanner;
public class cab{
    public static void main(String[] args) {
        Scanner mj = new Scanner(System.in);
        System.out.println("enter the distance");
        int dist = mj.nextInt();
        System.out.println("enter the time");
        int time = mj.nextInt();
        int price;
        
        if(time>=17 && time<=21){
            price = 20*time;
            System.out.println("fare is"+dist*20);
        }else if(time>=1 && time<17){
            price = 15*time;
            System.out.println("rs"+ price);
        }else{
            System.out.println("the Cab will not run in this hour");
        }

    }
}