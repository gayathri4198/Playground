import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
       int num = in.nextInt();
       int digCount = 0, copynum=0;
      copynum = num;
       if(num == 0)
       {
         System.out.print(num);
       }
      else 
        while(num > 0)
        {
          num = num/10;
          digCount++;
        }
      num = copynum;
      int pow = 1;
      int sum = 0;
      while(num > 0)
      {
        int rem = num % 10;
        for(int count = 1; count <= digCount; count++)
        {
          pow = pow * rem;
        }
        sum = sum + pow;
        pow = 1;
        num = num/10;
      }
      if(sum == copynum)
        System.out.print("Armstrong Number");
      else 
        System.out.print("Not a Armstrong Number");
	}
}

