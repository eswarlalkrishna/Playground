#include<iostream>
using namespace std;
int help(int m,int n)
{
	int i=0;
  	if(i==n)
      	return 1;
  	else
      	return m*help(m,n-1);
}
int main()
{
	int m,n,req;
  	cin>>m>>n>>req;
  	int k=help(m,n);
  	if(req<=k)
      	cout<<"Doctor, you can proceed with your experiment.";
  	else
      	cout<<"Sorry Doctor! You need more bacteria.";
  	return 0;
}