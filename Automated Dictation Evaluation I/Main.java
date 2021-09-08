#include<iostream>
//#include<string.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	char s1[20],s2[20];
  	cin>>s1>>s2;
  	int r=strcmp(s1,s2);
  	if(r==0)
      	cout<<"It is correct";
  	else
      	cout<<"It is wrong";
  	return 0;
}