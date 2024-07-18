import java.util.Scanner;
class pn{
   public static void main(String[] args)
     {
       int a;
       System.out.print("Enter any number :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       if(a>0){
          System.out.print(a + " is postive number");
       }else if(a<0){
           System.out.print(a + " is negative number");
       }else{
           System.out.print(a + " is Zero");              
  }
 }
}