#include<iostream>
int main()
{
  int a,b,add,sub,mul,div,mod;
  std::cin>>a;
  std::cin>>b;
  add=a+b;
  sub=a-b;
  mul=a*b;
  div=a/b;
  mod=a%b;
  std::cout<< "a+b=" <<add << '\n';
  std::cout<< "a-b=" <<sub << '\n';
  std::cout<< "a*b=" <<mul << '\n';
  std::cout<< "a/b=" <<div <<'\n';
  std::cout<< "a%b=" <<mod << '\n';
}