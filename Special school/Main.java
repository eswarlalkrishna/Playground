#include<iostream>
#include<bits/stdc++.h>
#include<cstring>
using namespace std;
int main()
{
	string s,r;
  	cin>>s>>r;
  	reverse(s.begin(),s.end());
  	if(s==r)
      	cout<<"It is correct";
  	else
      	cout<<"It is wrong";
  	return 0;
}