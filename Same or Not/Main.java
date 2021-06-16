#include<iostream>
using namespace std;
int main()
{
	int m,n,i=0,c1=0,c2=0;
  	cin>>m>>n;
  	int a[m];
  	int b[n];
  	while(i<m)
    {
    	cin>>a[i];
      	c1+=a[i];
      	i++;
    }
  	i=0;
  	while(i<n)
    {
    	cin>>b[i];
      	c2+=b[i];
      	i++;
    }
  	if((m==n) && c1==c2)
      	cout<<"Same";
  	else
    	cout<<"Not Same";
  	return 0;
}