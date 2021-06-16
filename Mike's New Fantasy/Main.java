#include<iostream>
using namespace std;
int main()
{
  	long int n,i,c1,c2,c3;
  	c1=0;c2=1;i=1;
  	cin>>n;
  	if(n<1 || n>70)
      	return 0;
  	while(i<n)
    {
    	c3=c1+c2;
      	c1=c2;
      	c2=c3;
      	i++;
    }
  	cout<<c1;
  	return 0;
}