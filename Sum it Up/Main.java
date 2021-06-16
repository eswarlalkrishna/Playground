#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int n,s,r;
  	cin>>n;
  	s=0;
  	if(n<1 || n>(pow(n,10)))
      	return 0;
  	while(n!=0)
    {
    	s+=n%10;
      	n/=10;
    }
  	while(s>0)
    {
       	r+=s%10;
      	s/=10;
    }
    cout<<r;
  	return 0;
}