#include<iostream>
#include <cstring>
using namespace std;
int main()
{
	char c[20],d[20];
  	cin>>c;
  	strcpy(d,c);
  	cout<<"The copied string is "<<d;
  /*
  	int i=0;
  	while(i<20)
    {
    	cin>>c[i];
      	i++;
    }
  	i=0;
  	cout<<"The copied string is ";
  	while(i<10)
    {
    	cout<<c[i];
      	i++;
    }*/
  	return 0;
}