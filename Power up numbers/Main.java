#include<iostream>
using namespace std;
int main()
{
	long int n,e,p;
  	p=1;
  	cin>>n>>e;
  	if(n<0 || e<0)
      	return 0;
  	while(e!=0)
    {
    	p*=n;
      	e--;
    }
  	cout<<p;
}