#include<iostream>
using namespace std;
int main()
{
	int m,i=0,j=0,flag=1;
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
  	i=1;
  	while(i<m)
    {
    	j = 0;
    	while(j<i)
        {
      		if(a[i][j]!=0)
      		{
            	flag = 0 ;
            	break ;
      		}
            j++;
    	}
    	i++;
    }
  	if(flag==1)
      	cout<<"Upper Triangular Matrix";
  	else
		cout<<"Not an Upper Triangular Matrix" ;
  	return 0;
}