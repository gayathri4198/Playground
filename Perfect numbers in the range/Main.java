#include<iostream>
int main()
{
  int i,j,a,b,sum;
  std::cin>>a>>b;
  for(i=a;i<=b;i++)
  {
    sum=0;
    for(j=1;j<i;j++)
    {
    if(i%j==0)
    {
      sum=sum+j;
    }
    }
    if(sum==i)
    {
     std::cout<<i<<" ";
    }
  }
}
      