#include<iostream>
using namespace std;
int main()
{
    int r,c,n;
    cin>>r>>c>>n;
   
    if((n<=r+1) || (n%r==1) || (n>=r*c-r)) 
    {
        cout<<"Yes";
    }
    else
    {
        cout<<"No";
    }
    return 0;
}