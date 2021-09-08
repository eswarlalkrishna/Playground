#include<iostream>
using namespace std;
struct det
{
  	int id,age;
  	float sal;
  	string name,desg;
};
int main()
{
  	det s;
  	cout<<"Enter name:"<<endl;
  	cin>>s.name;
  	cout<<"Enter ID:"<<endl;
  	cin>>s.id;
  	cout<<"Enter age:"<<endl;
  	cin>>s.age;
  	cout<<"Enter designation:"<<endl;
  	cin>>s.desg;
  	cout<<"Enter Salary:"<<endl;
  	cin>>s.sal;
  	cout<<"Employee Details"<<endl;
  	cout<<"Name of the Employee : "<<s.name<<endl;
  	cout<<"ID of the Employee : "<<s.id<<endl;
  	cout<<"Age of the Employee : "<<s.age<<endl;
  	cout<<"Designation of the Employee : "<<s.desg<<endl;
  	cout<<"Salary of the Employee : "<<s.sal<<endl;
  	return 0;
}