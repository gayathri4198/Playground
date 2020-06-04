import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      for(int i = 0;i<=size-1;i++)
      {
        arr[i] = in.nextInt();
      }
      for(int id1 = 0; id1<= size-2; ++id1)
      {
        for(int id2 = id1+1; id2<=size-1; id2++)
        {
          for(int id3 = id2+1; id3<=size-1; id3++)
          {
            System.out.print("(" + arr[id1] + "," +" "+ arr[id2] + "," +" "+ arr[id3]+")");
            System.out.print(" ");
          }
        }
        System.out.println();
      }
    }
}
