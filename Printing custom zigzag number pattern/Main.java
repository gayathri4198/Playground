import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      for(int row=1;row<=num;row++)
      {
        for(int col=1;col<=num;col++)
        {
          if(((col==num)&&(row%2==1))||((col==1 )&& (row%2==0)))
          {
            System.out.print(row+1);
          }
          else
          System.out.print(row);
        }
        System.out.println();
      }
	}
}