#include<iostream>
using namespace std;
struct College 
{ 
  char name[100]; 
  char city[100]; 
  int establishmentYear; 
  float passPercentage; 
} ;
int main()
{
  int n,i,count=1;
  cout<<"Enter the number of colleges"<<endl;
  cin>>n;
  struct College c[i];
  for(int i=0;i<n;++i)
  {
  cout<<"Enter the details of college "<<count<<endl;
    count++;
    cout<<"Enter name"<<endl;
    cin>>c[i].name;
    cout<<"Enter city"<<endl;
    cin>>c[i].city;
    cout<<"Enter year of establishment"<<endl;
    cin>>c[i].establishmentYear;
    cout<<"Enter pass percentage"<<endl;
    cin>>c[i].passPercentage;
  }
  cout<<"Details of colleges"<<endl;
  count=1;
  for(int i=0;i<n;i++)
  {
    cout<<"College:"<<count++<<endl;
  cout<<"Name:"<<c[i].name<<endl;
    cout<<"City:"<<c[i].city<<endl;
    cout<<"Year of establishment:"<<c[i].establishmentYear<<endl;
    cout<<"Pass percentage:"<<c[i].passPercentage<<endl;
  }
}
