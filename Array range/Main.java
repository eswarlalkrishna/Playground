#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int n,i=0,mn=0,mx=0;
  	cout<<"Enter the number of elements in the array"<<endl;
  	cin>>n;
  	int a[n];
  	if(n>20 || n<0)
      	return 0;
  	cout<<"Enter the elements in the array"<<endl;
  	while(i<n)
    {
    	cin>>a[i];
      	i++;
    }
  	sort(a,a+n);
  	cout<<"The range of the array is "<<a[n-1]-a[0]<<endl;
  	return 0;
}