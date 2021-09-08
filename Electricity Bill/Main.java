#include<iostream>
using namespace std;
int main()
{
  int units;
  cin>>units;
  if(units<=200)
    //cost = units*0.5;
    cout<<"Rs."<<int(units*0.5);
  else
  if(units>200 && units<=400)
    cout<<"Rs."<<int(units*0.65+100);
  else
  if(units>400 && units<=600)
    cout<<"Rs."<<int(units*0.8+200);
  else
  if(units>600)
    cout<<"Rs."<<int(units*1.25+425);
  return 0;
}