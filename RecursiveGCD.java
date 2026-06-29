import java.util.Scanner;
public class GCD
{
  static int gcd(int a,int b)
  {
    if(b==0)
    {
      return a;
    }
    return gcd(b,a%b);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter First Number: ");
    int a=sc.nextInt();
    System.out.print("Enter Second Number: ");
    int b=sc.nextInt();
    System.out.print("GCD of Number: "+gcd(a,b));
  }
}