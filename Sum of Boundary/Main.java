#include<iostream>
using namespace std;
int main()
{
	int m,n,i=0,j=0,c=0;
  	cin>>m>>n;
  	if(m>5)
      	return 0;
  	int a[m][m];
  	while(i<m)
    {
      	j=0;
    	while(j<n)
        {
        	cin>>a[i][j];
          	if(i==0 || i==m-1 || j==0 || j==n-1)
            	c+=a[i][j];
          	j++;
        }
      	i++;
    }
    cout<<"Sum of boundaries is "<<c;   
  	return 0;
}