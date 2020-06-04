import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int num = in.nextInt();
      int fact = 1, sum=0;
      int copy = num;
       if(num == 0)
         System.out.print(num);
       else
       {
         while(num > 0)
         {
           int rem = num % 10;
           for(int count = 1;count<= rem ; count++)
           {
             fact = fact * count;
           }
           sum = sum + fact;
           fact = 1;
          // num = copy;
           num = num / 10;
	      }
       }
        if( sum == copy)
          System.out.print("Yes");
         else 
           System.out.print("No");
    }     
}