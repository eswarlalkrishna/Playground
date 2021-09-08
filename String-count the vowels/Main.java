#include<iostream>
using namespace std;
int main()
{
	string a;
  	int i=0,c=0;
  	cin>>a;
  	while(i<a.length())
    {
    	if(a[i]=='a' || a[i]=='A' || a[i]=='e' || a[i]=='E' || a[i]=='i' || a[i]=='I' || a[i]=='o' || a[i]=='O' || a[i]=='u' || a[i]=='U')
        	c++;
      	i++;
    }
  	cout<<"Number of vowels: "<<c;
  	return 0;
}