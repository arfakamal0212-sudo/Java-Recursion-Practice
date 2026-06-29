import java.util.Scanner;
public class Power
{
  static int power(int base,int exp)
  {
    if(exp==0)
    {
      return 1;
    }
    return base*power(base,exp-1);
  }
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Base: ");
    int base=sc.nextInt();
    System.out.println("Enter Exponent: ");
    int exp=sc.nextInt();
    System.out.println("Power of Nunber: "+power(base,exp));
  }
}