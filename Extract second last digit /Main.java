import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int digit = in.nextInt();
      int num = (digit%1000)/10;
      int num2= num%10;
      System.out.print(num2);
	}
}