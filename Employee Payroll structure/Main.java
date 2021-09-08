#include<iostream>
#include<bits/stdc++.h>
using namespace std;
struct emp
{
	float id,bs,hra,da,ma,pf,ins;
  	//float gs,ns;
  	float gs=(bs+hra+da+ma+pf+ins)*12e2f;
  	float ns=gs-(pf+ins)*12e2f;
  	string name;
}s[2];
int main()
{
	int n,i=0;
  	cout<<"Enter the number of employees: "<<endl;
  	cin>>n;
  	cout<<"Enter your input for every employee:"<<endl;;
  	while(i<2)
    {
  		cout<<"Employee ID: "<<endl;;
  		cin>>s[i].id;
      	cout<<"Employee Name: "<<endl;;
      	cin>>s[i].name;
      	cout<<"Basic Salary, HRA: "<<endl;;
      	cin>>s[i].bs>>s[i].hra;
      	cout<<"DA, Medical Allowance: "<<endl;;
      	cin>>s[i].da>>s[i].ma;
      	cout<<"PF and Insurance: "<<endl;;
      	cin>>s[i].pf>>s[i].ins;
      	i++;
    }
  	cout<<"Enter employee ID to get payslip: ";
  	int j;
  	cin>>j;
  	i=0;
  	while(i<2)
    {
  		if(s[i].id==j)
        {
      	cout<<"\nSalary Slip of "<<s[i].name;
      	cout<<"\nEmployee ID: "<<s[i].id;
      	cout<<"\nBasic Salary: "<<s[i].bs;
      	cout<<"\nHouse Rent Allowance: "<<s[i].hra;
      	cout<<"\nDearness Allowance: "<<s[i].da;
        cout<<"\nMedical Allowance: "<<s[i].ma;
      	cout<<"\nGross Salary: "<<(s[i].bs+s[i].hra+s[i].da+s[i].ma)*12<<" Rupees";
      	//cout<<"\nGross Salary: "<<s[i].gs<<" Rupees";
        cout<<"\n";
      	cout<<"Deductions:";
      	cout<<"\nProvident fund: "<<s[i].pf;
        cout<<"\nInsurance: "<<s[i].ins;
      	cout<<"\nNet Salary: "<<(s[i].bs+s[i].hra+s[i].da+s[i].ma)*12-(s[i].pf+s[i].ins)*12<<" Rupees";
        }
      	i++;
    }
}