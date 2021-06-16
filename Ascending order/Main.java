#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n,i=0;
  	int a[n];
  	cin>>n;
  	while(i<n)
    {
      	cin>>a[i];
      	i++;
     }
  	sort(a,a+n);
  	i=0;
  	cout<<"Sorted array is:"<<endl;
  	while(i<n)
    {
    	cout<<a[i]<<endl;
    	i++;
    }
 	return 0; 	
}