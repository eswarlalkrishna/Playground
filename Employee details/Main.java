#include<iostream>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;
union e_details
{
	char nm[30];
	int sal;
}em;
int main()
{
	//union e_details em;
  	cout<<"Enter the Employee details";
  	cout<<"\nEnter the Employee name :";
  	cin>>em.nm;
  	cout<<"\nEnter the Employee salary :";
  	cin>>em.sal;
  	cout<<"\nEmployee Details"<<endl;
  	cout<<em.nm<<" "<<em.sal;
  	return 0;
}