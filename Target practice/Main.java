#include<iostream>
using namespace std;
int main()
{
 int n,n1,s,t=1;
  std::cin>>n>>n1;
  s=n1;
  while(s<n)
  {
    cin>>n1;
    s=s+n1;
    t++;
  }
  std::cout<<"The number of turns is "<<t;

}