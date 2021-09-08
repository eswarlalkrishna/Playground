#include<iostream>
using namespace std;
int main()
{
	char c[20];
  	int i=0;
  	cin>>c;
  	while(c[i]!='\0')
    {
    	i++;
    }
  	cout<<"The length of word "<<c<<" is "<<i;
  	return 0;
}