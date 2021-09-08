#include<iostream>
using namespace std;
int main()
{
	int r,c,i=0,j=0;
  	cin>>r>>c;
  	//if (r!=c)
      //	return 0;
  	int a[r][c];
  	int b[r][c];
  	int k[r][c];
  	while(i<r)
    {
    	j = 0;
    	while(j<c)
        {
      		cin>>a[i][j];
          	j++;
    	}
      	i++;
    }
  	i=0;
  	while(i<r)
    {
    	j = 0;
    	while(j<c)
        {
      		cin>>b[i][j];
          	j++;
    	}
      	i++;
    }
  	i=0;
  	while(i<r)
    {
    	j = 0;
    	while(j<c)
        {
      		k[i][j]=a[i][j]+b[i][j];
          	j++;
    	}
      	i++;
    }
  	i=0;
  	while(i<r)
    {
    	j = 0;
    	while(j<c)
        {
      		cout<<k[i][j]<<" ";
            j++;
    	}
    	cout << endl;
      	i++;
    }
}