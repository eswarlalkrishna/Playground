#include<iostream>
using namespace std;
int main()
{
  string str;
  int  n;
  cin>>str;
  cin>>n;
  if (((str =="front"||str=="FRONT") && n==2) || ((str=="rear" || str== "REAR") && n==1))
      cout<<"Right Handed";
  else
    cout<<"Left Handed";
}