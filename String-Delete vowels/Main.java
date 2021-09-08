#include<iostream>
using namespace std;
int main()
{
  	string s;
  	cin>>s;
  	int i=0;
  	while(i<s.size())
  	{
    	if (s.at(i)=='a' || s.at(i)=='A'||s.at(i)=='e' || s.at(i)=='E'||s.at(i)=='i' || s.at(i)=='I'||s.at(i)=='o' || s.at(i)=='O'||s.at(i)=='u' || s.at(i)=='U')
    	{
    	}
    	else
    		cout<<s[i];
    	i++;
  	}
  	return 0;
}