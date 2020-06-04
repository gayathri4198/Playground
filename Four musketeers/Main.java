#include<iostream>
using namespace std;
int main()
{
  float x1,x2,x3,y1,y2,y3;
  float c,d;
  std::cin>>x1;
  std::cin>>y1;
  std::cin>>x2;
  std::cin>>y2;
  std::cin>>x3;
  std::cin>>y3;
  c=(x1+x2+x3)/3;
  d=(y1+y2+y3)/3;
  std::cout<<c<<"\n";
  std::cout<<d;
}