#include <iostream>
using namespace std;
int swp(int& a,int& b)
{
	a=a+b;
  	b=a-b;
  	a=a-b;
  	return a,b;
}
int main() 
{
	int a,b;
  	cin>>a>>b;
  	cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  	swp(a,b);
	cout<<"After swapping a= "<<a<<" and b="<<b;
  	return 0;
}