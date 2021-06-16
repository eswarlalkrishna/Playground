#include<iostream>
using namespace std;
int main()
{
  	int a;
  	double t;
  	cin>>a;
  	cin>>t;
  	if(a<14)
  	{
  	    if(t==10.15 || t==18.00 || t==22.00)
            cout<<"$4.00";
  	    else
        {
        if(t==13.30)
    	    cout<<"$2.00";
        }
  	}
  	if(a>13)
  	{
  	    if(t==10.15 || t==18.00 || t==22.00)
            cout<<"$8.00";
  	    else
        {
        if(t==13.30)
    	    cout<<"$5.00";
        }
  	}
       return 0;
}