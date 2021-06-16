#include<iostream>
using namespace std;
int main()
{
	int n;
  	cin>>n;
  	if(n==0 || n==1)
  	    return 0;
  	else
  	    cout<<(n*(n-1))/2;
  	return 0;
}