#include <iostream>
using namespace std;

int main() 
{
	int x,a,b,c,d;
  	cin>>x>>a>>b>>c>>d;
  	(x==1)? cout<<(a+c)<<"+"<<(b+d)<<"i":(x==2)? cout<<(a-c)<<"+"<<(b-d)<<"i":(x==3)? cout<<((a*c)-(b*d))<<((b*c)+(a*d))<<"i":cout<<"Invalid choice";
  	return 0;
}