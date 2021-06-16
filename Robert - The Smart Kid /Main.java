#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	long int n;
  	long int s=0;
  	cin>>n;
  	if(n<1 || n>(pow(10,16)))
      	return 0;
   	s=n*(1+n)/2;
  	cout<<s;
  	return 0;
}