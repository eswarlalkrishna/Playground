#include<iostream>
using namespace std;
int main()
{
	int m,n,i=0,j=0;
  	cin>>m>>n;
  	if (m!=n)
      	return 0;
  	int a[m][n];
  	int b[m][n];
  	int c[m][n];
  	while(i<m)
    {
    	j = 0;
    	while(j<n)
        {
      		cin>>a[i][j];
          	j++;
    	}
      	i++;
    }
  	i=0;
  	while(i<m)
    {
    	j = 0;
    	while(j<n)
        {
      		cin>>b[i][j];
          	j++;
    	}
      	i++;
    }
  	i=0;
  	while(i<m)
    {
    	j = 0;
    	while(j<n)
        {
      		c[i][j]=a[i][j]+b[i][j];
          	j++;
    	}
      	i++;
    }
  	i=0;
  	while(i<m)
    {
    	j = 0;
    	while(j<n)
        {
      		cout<<c[i][j]<<" ";
            j++;
    	}
    	cout << endl;
      	i++;
    }
}