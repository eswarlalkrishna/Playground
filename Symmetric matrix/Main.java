#include<iostream>
using namespace std;
int main()
{
	int m,n,i=0,flag=1;
  	cin>>m>>n;
  	int a[m][n];
  	while(i<m)
    {
      	int j=0;
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
      	int j=0;
      	while(j<n)
        {
          	if(a[i][j]!=a[j][i])
          		flag=0;
      		j++;
        }
     	i++;
    }
  	if (flag==1)
      	cout<<"Symmetric";
  	else
      	cout<<"Not Symmetric";
  	return 0;
}