#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int n,i;
  	i=1;
  	cin>>n;
  	if(n<1 || n>(pow(n,10))) return 0;
  	while(i<=n/2)    {
    	if(n%i==0) cout<<i<<" ";
      	i++;
    }
  	cout<<n;
  	return 0;
}