package p4n01;
import java.util.Scanner;
public class user_oddeven {
    public static void main(String args[] ){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter a no");
        int no=sc.nextInt();
        
        int a=no%2;
        if(a==0){
              System.out.println("It is even no");
          }
           else{
               System.out.println("It is odd no");
        }
                  }
}
    
  
