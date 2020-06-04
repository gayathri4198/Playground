import java.util.Scanner;
class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    int result= power(base,exponent);
    System.out.print(result);
  }
  public static int power(int b,int e)
  {
  int pow=1;
    for(int row = 1;row<=e; row++)
    {
      pow=pow*b;
    }
    return pow;
  }
}
  