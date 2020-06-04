import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int digit = in.nextInt();
    int n1 = digit/100;
    int n2 = (digit/10)%10;
    int n3 = (digit%10);
    int output = (n3*100) + (n2*10) + (n1*1);
    System.out.print(output);
  }
}