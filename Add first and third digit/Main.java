import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int digit = in.nextInt();
      int first = (digit/100)%10;
      int last = digit%10;
       int add = first+last;
      System.out.print(add);
	}
}