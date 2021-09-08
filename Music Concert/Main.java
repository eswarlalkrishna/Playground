#include<iostream>
#include<cstdlib>
using namespace std;
int main()
{
	int n,*p,m=0,w=0,i=0;
	cin>>n;
	p = (int*) malloc (n*sizeof(int));
	while(i<n)
    {
      	cin>>*(p+i);
      	i++;
    }
	i=0;
  	while(i<n)
	{
      	if(*(p+i)%2)
			m++;
      	else
			w++;
      	i++;
	}
	cout<<m<<"\n"<<w;
	return 0;
}