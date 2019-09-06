package p4n01;
public class comparison_innumbers {
     public static void main(String [] args){
       int a,b,c;
       a=10;
       b=20;
       c=30;
       
       if(a>b || a<b){
           System.out.println("This is T");
           
          }else{if (b>c || c>b){
              System.out.println("This is 2T");
              
               }else{if (a>c || b<c || a<c){
                   System.out.println("This is 3T");
                   
                   }else{
                       System.out.println("This is F");
                       
               }
           }
       }
     }          
}      
              
         
                   
                   
                   
                   
                   
       
    

