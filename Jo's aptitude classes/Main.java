#include<iostream>
int hcf(int m,int n)
{
	if(n!=0)
      	return hcf(n,m%n);
  	else
      	return m;
}
int main()
{
	int a,b,c,gcd1,res,ans;
    std::cin>>a>>b>>c>>ans;
  	res=hcf(a,b);
  	gcd1=hcf(c,res);
  	if(gcd1==ans)
  	    std::cout<<"Answer is correct.";
  	else
  	    std::cout<<"Answer is wrong.";
  	return 0;
}