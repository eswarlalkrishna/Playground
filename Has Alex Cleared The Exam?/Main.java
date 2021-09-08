#include<iostream>
using namespace std;
int main()
{
	int n,i,s;
  	cin>>n;
  	int a[n];
  	i=0;
  	while(i<n)
    {
    	cin>>a[i];
      	i++;
    }
    cin>>s;
    i=0;
    while(i<n)
    {
      	if(s==a[i])
        {
            cout<<"She passed her exam";
            return 0;
        }
  	    i++;
    }
    cout<<"She failed";
  	return 0;
}