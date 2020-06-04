import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
       int input = in.nextInt();
       int factors,i;
       for(i = 1 ; i <= input ; i++)
       {
         if(input % i == 0)
         {
           factors = i;
           System.out.println(factors);
	     }
       }
    }
}