#include<iostream>
using namespace std;
int main()
{
	int m,i=0,j=0,c=0;
  	cin>>m;
  	int a[m][m];
  	while(i<m)
    {
    	j = 0;
    	while(j<m)
        {
      		cin>>a[i][j];
          	j++;
    	}
      	i++;
    }
  	i=0;
  	while(i<m-1)
    {
    	j = 1;
    	while(j<m-1)
        {
      		if(a[i][j]==0)
            	c=1;
          	//else
              //	c=0;
            j++;
    	}
    	i++;
    }
  	if(c==1)
      	cout<<"Lower Triangular Matrix";
  	else
		cout<<"Not a Lower Triangular Matrix";
  	return 0;
}