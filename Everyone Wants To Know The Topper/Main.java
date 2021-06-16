#include<iostream>
using namespace std;
int main()
{
	int n,i,max;
  	cin>>n;
  	int a[n];
  	i=max=0;
  	while(i<n)
    {
    	cin>>a[i];
      	if(a[i]>max)
          	max=a[i];
      	i++;
    }
  	cout<<max;
  	return 0;
}