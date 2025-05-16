//This example demonstrates how to initialize an array and traverse it using a for loop to print each element.
public class evenodd  {
    public static void main(String[]args){
        int []arr ={5,3,8,1,2,};
         int even = 0;
         int odd = 0;
         for (int i = 0; i < arr.length; i++){
             
            if (arr[i] % 2 == 0){
                 even++;
                }else{
                odd++;
              }
         
             System.out.println("no of the even numbers " + even );
             System.out.println("no of the odd numbers " + odd );
        }

    }

}


             
         
         

 

  



