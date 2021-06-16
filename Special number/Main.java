#include<iostream>
using namespace std;
int main()
{
	int m,n,i,j;
  	cin>>m>>n;
  	if(m>n || m==n)
      	return 0;
  	i=0;
  	j=1;
  	while(m<=n)
    {
      	i=i+m%10+((m/10)%10);
      	j=j*m%10*((m/10)%10);
      	if(i+j == m)
          	cout<<m<<endl;
      	m++;
      	i=0;
      	j=1;
    }
  	return 0;
}