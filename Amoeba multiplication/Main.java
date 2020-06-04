#include<iostream>
using namespace std;
int main()
{
 int n1=0,n2=1,n3=3,i,num;
  std::cin>>num;
  for(i=2;i<num;++i)
  {
    n3=n1+n2;
    n1=n2;
    n2=n3;
  }
  std::cout<<n3;
}
