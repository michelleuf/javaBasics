import java.util.Scanner;

public class JavaApplication5 {


    public static void main(String args[]){
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number");
        int num=input.nextInt();
        
        JavaApplication5 objPrime=new JavaApplication5();
        objPrime.prime(num);
      
    }
        
   public void prime(int n){
       
       int result,i,count = 0;
       for(i=2;i<=n;i++){
           result=n%i;
          // System.out.println("n : "+n+"\ni : "+i+"\nresults : "+result);
         
         if(result==0 && i<n){
               if (n!=1) {
                   count++;
                 //  System.out.println("after if result: "+result);
                  // System.out.println(count);
               }
         }
       }
       if(count==0){
           System.out.println("Prime");
       }else{
           System.out.println("Not prime");
       }
   }
   

}
