#include<iostream>
using namespace std;
int main()
{
	int m,n,i=0,j=0,s;
  	cin>>m>>n;
  	int a[m][n];
  	while(i<m)
    {
      	s=0;
      	j=0;
    	while(j<n)
        {
        	cin>>a[i][j];
          	s=s+a[i][j];
          	j++;
        }
      	cout<<s<<endl;
      	//s=0;
      	i++;
    }
  	return 0;
}