#include<iostream>
#include<cmath>
using namespace std;
int main()
{
int n,days=0;
 double s,r;
  cin>>n;
 s = sqrt(n);
 r= (n/s)/s;
for(int i=1;i<=n; i++)
{
  days++;
}  
  if ((n/s) >= 1)
  {     days+= n/s;
  }
  if (r<=1)
  { days+= r;
  }
  cout<<days;
       }