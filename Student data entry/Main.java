#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
	struct student s;
  	cin.getline(s.name,50);
    cin>>s.roll;
  	cin>>s.marks;
  	cout<<"\nStudent Details"<<endl<<"Name: "<<s.name<<endl<<"Roll: "<<s.roll<<endl<<"Marks: "<<s.marks<<endl;
  	return 0;
}