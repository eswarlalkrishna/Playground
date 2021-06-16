#include<iostream>
using namespace std;
int main()
{
	int m , i = 0 , j = 0 , nz = 1 , z = 1 ;
  	cin>>m;
  	int a[m][m];
  	while(i<m)
    {
      j=0;
      while(j<m)
        {
        	cin>>a[i][j];
          	if( i==j && a[i][j] == 0 ) // checks is the diagonal have 0 ?
              nz = 0 ;
            if ( i != j && a[i][j] != 0 ) // checks other than diagonal for non zero ?
              z = 0 ;
            j++;
        }
      i++;
    }
    if( z == 0 || nz == 0 )
      	cout<<"No";
  	else
      	cout<<"Yes";
  	return 0;
}