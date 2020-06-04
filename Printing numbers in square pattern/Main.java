import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int num = in.nextInt();
     // int turn = 1;
      for(int row = 1; row<=num; row++)
      {
        for(int col = 1;col<=num;col++)
        {
         System.out.print(row);
        } 
        System.out.print("\n");
      }
	}
}