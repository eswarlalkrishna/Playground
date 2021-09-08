#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int n,i,s;
  	cin>>n;
  	i=1;
  	s=0;
  	if(n<1 && n>(pow(10,10))) return 0;
  	while(i<=n/2)
    {
    	if(n%i == 0) s+=i;
      	i++;
    }
  	if(n == s)
      	cout<<"Yes";
  	else
      	cout<<"No";
  	return 0;
}