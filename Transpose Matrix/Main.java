#include<iostream>
using namespace std;
int main()
{
	int m,i=0,j=0;
  	cin>>m;
  	//if (m!=n)
      //	return 0;
  	int a[m][m];
  	//int b[n][m];
  	//int c[m][n];
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
  	while(i<m)
    {
    	j = 0;
    	while(j<m)
        {
      		cout<<a[i][j]<<" ";
            j++;
    	}
    	cout << endl;
      	i++;
    }
  	cout<<"Transpose matrix is:"<<endl;
  	i=0;
  	while(i<m)
    {
    	j = 0;
    	while(j<m)
        {
      		cout<<a[j][i]<<" ";
            j++;
    	}
    	cout << endl;
      	i++;
    }
}