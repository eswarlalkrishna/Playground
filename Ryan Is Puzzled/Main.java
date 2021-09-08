#include<iostream>
using namespace std;
int main()
{
	int r,c,i=0,j=0;
  	cin>>r>>c;
  	int a[r][c];
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
  	while(i<c)
    {
    	j = 0;
    	while(j<r)
        {
      		cout<<a[j][i]<<" ";
            j++;
    	}
    	cout << endl;
      	i++;
    }
  	return 0;
}
