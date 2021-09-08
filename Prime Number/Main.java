#include<iostream>
#include<cmath>
using namespace std;
int prime(int n,int d)//37,6
{
	if(d==1)
  		return 1;
  	else if(n%2 ==0)
    {
    	return 0;
    }
  	else if(n%2 !=0)
      	return prime(n,d-1);
}
int main()
{
	int n,d,i=1;
  	cin>>n; //37
  	d=sqrt(n);//6
  	i=prime(n,d);
  	if(i==1)
      	cout<<"Prime Number";
  	else
      	cout<<"Not a Prime Number";
  	return 0;
}