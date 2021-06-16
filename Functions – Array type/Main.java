#include<iostream>
using namespace std;
int main()
{
	int n,i=0,o=0,e=0,m=0;
  	cout<<"Enter the number of elements in the array"<<endl;;
  	cin>>n;
  	int a[n];
  	cout<<"Enter the elements in the array"<<endl;;
  	while(i<n)
    {
    	cin>>a[i];
      	if(a[i]%2==0)
          	e++;
      	else
          	o++;
      	i++;
    }
    if(e==n)
      	cout<<"The array is Even";
    else
  	if(o==n)
      	cout<<"The array is Odd";
    else
  	  	cout<<"The array is Mixed";
  	return 0;
}