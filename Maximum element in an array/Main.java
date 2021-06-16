#include<iostream>
using namespace std;
int mx(int a[],int n)
{
	if(n==1)
      	return a[0];
  	else
      	return max(a[n-1],mx(a,n-1));
}
int main()
{
	int n,i=0;
  	cout<<"Enter the size of the array"<<endl;
  	cin>>n;
  	int a[n];
  	cout<<"Enter "<<n<<" elements of an array"<<endl;
  	while(i<n)
    {
    	cin>>a[i];
      	i++;
    }
  	cout<<"Maximum element in the array is "<<mx(a,n);
}