#include<iostream>
using namespace std;
int main()
{
  	int n,i=0,j=0,c=0 ;
  	cin>>n;
  	int a[n];
  	while(i<n)
  	{
    	cin>>a[i];
    	i++;
    }
  i=0;
  	while(i<n)
  	{
  		while(j<i)
        {
        	if(a[i]==a[j])
            {
              	//j++;
              	break;
            }
          	j++;
        }
    	if(i==j)
         	c++;
      	i++;
  	}
    cout << "There are "<<c<<" distinct element in the array." ;
  	return 0 ;
}