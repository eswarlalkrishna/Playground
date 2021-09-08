#include<iostream>
using namespace std;
int SumNumbersDivisible(int m, int n)
{
	int s=0;
	while(m<n)
	{
	    if(m%15==0)
	        s+=m;
	    m++;
	}
	return s;
}
int main()
{
	int m,n;
  	cin>>m>>n;
  	cout<<SumNumbersDivisible(m,n);
  	return 0;
}