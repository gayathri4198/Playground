#include<iostream>
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
      std::cout<<"Enter first number :"<<" Enter second number :"<<" Menu"<<"\n";
       std::cout<<"1.Addition"<<"\n";
  std::cout<<"2.Subtraction"<<"\n";
   std::cout<<"3.Multiplication"<<"\n";
   std::cout<<"4.Division"<<"\n";
   std::cout<<"5.Remainder"<<"\n";
  switch(c){
          case 1:
                 d=a+b;
      std::cout<<d;
      break;
         case 2:
      d=a-b;
      std::cout<<d;
      break;
     case 3:
             d=a*b;
      std::cout<<d;
      break;            
    case 4:
            d=a/b;
      std::cout<<d;
      break;
             case 5:
            d=a%b;
      std::cout<<d;
      break;
          default:
            std::cout<<"Invalid operation";
        }
}
            