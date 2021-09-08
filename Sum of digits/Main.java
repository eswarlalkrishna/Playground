#include<iostream>
using namespace std;
int sumo(int n)
{
	static int s=0;
  	if(n<10)
      	return n;
  	else
  	 return n%10+sumo(n/10);
}

int main()
{
	int n;
  	cout<<"Enter the value of n"<<endl;
  	cin>>n;
  	cout<<"The sum of digits in "<<n<<" is "<<sumo(n);
  	return 0;
}