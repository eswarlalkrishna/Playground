#include<iostream>
using namespace std;
int main()
{
	int m,i=0,e=0,o=0;
  	cin>>m;
  	int a[m][m];
  	while(i<m)
    {
      	int j=0;
    	while(j<m)
        {
        	cin>>a[i][j];
          	if(a[i][j]%2==0)
              	e=1;
          	else
              	o=1;
          	j++;
        }
      	i++;
    }
  	if(e==1 && o==1)
      	cout<<"No";
  	else
      	cout<<"Yes";
  	return 0;
}