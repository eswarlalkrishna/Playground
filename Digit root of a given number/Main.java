#include<iostream>
using namespace std;
int red(int n)
{
    if(n==0)
        return 0;
    else if(n<10)
        return n;
    else
        return n%10+red(n/10);
}
int main()
{
    int n,l;
    l=0;
    cin>>n;
    int k=red(n);
    if(k>9)
    {
        while(k!=0)
        {
            l=l+k%10;
            k/=10;
        }
    }
    cout<<l;
    return 0;
}