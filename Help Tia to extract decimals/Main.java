#include<iostream>
#include<string>
#include<math.h>
using namespace std;
int main()
{ 
	string fnum;
	cin>>fnum;
  	if (fnum.find('.') != string::npos)
    {
		size_t pos = fnum.find('.');
		string str3 = fnum.substr (pos+1);
		cout<<"Floating part is : "<<str3;
	}
	else
		cout<<"Floating part is : ";
  	return 0;
}