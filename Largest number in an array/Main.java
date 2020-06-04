import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
       int arr_size = in.nextInt();
       int arr[] = new int[arr_size];
       for(int idx = 0; idx <= arr_size-1; idx++)
       {
        arr[idx]  = in.nextInt();
       }
      int maxval = 0;
       if(arr[0] > arr[1])
       {
        maxval = arr[0];
       }
      if(arr[1]>arr[0])
      {
        maxval = arr[1];
      }
      for(int idx = 2; idx <= arr_size-1; idx++)
      {
        if(maxval < arr[idx])
        {
          maxval = arr[idx];
        }
      }
      System.out.print(maxval);
    
    }
}