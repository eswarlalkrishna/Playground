#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	long int n,e,o;
  	cin>>n;
  	e=o=0;
  	if(n<1 || n>(pow(10,10)))
      	return 0;
  	cout<<n%11;
  	/*while(n!=0)
    {
    	if((n%10)%2==0)
          	e+=n%10;
      	if((n%10)%2==1)
          	o+=n%10;
      	n/=10;
    }
  	if(o>e)
      	cout<<o-e;*/
  	//else
      //	cout<<e-o;
  	return 0;
}