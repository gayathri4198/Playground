import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      int num = in.nextInt();
       int copy = num;
      for(int row=1;row<=num;row++)
      {
       int val=copy;
        for(int col=1;col<=copy;col++)
        {
          System.out.print(val);
          val--;
        }  
        System.out.println();
          copy=copy-1;
      }
    //  num=5;
	}
}