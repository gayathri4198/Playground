#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2;
  std::cin>>d1>>c1>>d2>>c2;
  int d; d=d1+d2;
  int c; c=c1+c2;
  while(c>100)
  {
    c=c-100;
    d=d+1;
    break;
  }
  std::cout<<d<<"\n"<<c;
  return 0;
}
