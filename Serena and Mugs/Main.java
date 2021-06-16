#include<iostream>
using namespace std;
int main()
{
  int n,mug,sum=0;
  cin>>n>>mug;
  int a[n];
  
  for(int i=0; i<n; i++)
    cin>>a[i];
  
  for(int i=0; i<n; i++)
    sum = sum+a[i];
  
  if(sum<=mug)
    cout<<"YES";
  else
    cout<<"NO";
  
}
/*#include<iostream>
using namespace std;
int main()
{
	int n,m,v,i=0,s=0;
  	cin>>m,v;
  	int a[n];
  	if((2<n || n>100) && (1<s || s>1000))
       return 0;
  	while(i<n)
    {
    	cin>>a[i];
      	s=s+=a[i];
      	i++;
    }
  	//i=0;
  	//while(i<n)
    //{
  	if(s<=v)
      		cout<<"YES";
  		else
      		cout<<"NO";
  	return 0;
}*/