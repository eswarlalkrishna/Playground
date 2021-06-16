
#include<iostream>
#include<cmath>
using namespace std;
long int gcd(long int m,long int n)
{
	//static int i;
  	if(n!=0)
      	return gcd(n,m%n);
  	else
      	return m;
}
int main()
{
	int m,n;
  	cin>>m>>n;
  	if(m<1 || m>(pow(10,16)) || n<1 || n>(pow(10,16)))
      	return 0;
  	cout<<gcd(m,n);
  	return 0;
}