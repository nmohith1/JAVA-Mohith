import java.util.Scanner;
class vote{
   public static void main(String[] args)
     {
       int a,n;
       System.out.print("Enter age :");
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
	n=18-a;
       if(a>18){
          System.out.print("The person is eligible to vote");
       }else{
           System.out.print("The person is not eligible to vote and He is eligible to vote after"+n+"years");
       }
  }
}