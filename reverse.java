import java.util.Scanner;
class rev{
  public static void main(String[] args){
    int a,b=0,c,n;
    System.out.print("Enter the number: ");
    Scanner sc = new Scanner(System.in);
    n=sc.nextInt();
    c=n;
    while(n!=0){
     a=n%10;
     b=(b*10)+a;
     n/=10;
    }
      System.out.print(b+" is the reverse of "+c+"\n");    
    if(c==b){
      System.out.println("\n"+c+" is a palindrome");
    }else{
      System.out.println(c+" is not a palindrome");
    }
  }
}