#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
	int i=0;
  	int s=0;
	int l=n;  
  	while(n!=0)
    {
      	i++;		//i=1,n=15,i=2,n=1,i=3,n=0
      	n/=10;
    }
  	n=l;
  	while(n!=0)
    {
    	int g=n%10;
      	//int r=;
      	s+=(power(g,i));
      	n/=10;
    }
  	if(s==l)
      	return 1;
  	else
  		return 0;
}
int main()
{
    int n;
    std::cin>>n;
  	if(n<1 || n>(power(10,10)))
      	return 0;
    if(arm(n)==1)
        std::cout<<"Yes";
    else
        std::cout<<"No";
    
}