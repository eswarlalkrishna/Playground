#include<iostream>
using namespace std;
int fun(int n)
{
    if(n==1 || n==2)
        return 1;
    else if(n==3)
        return 2;
    return fun(n-3) + fun(n-1);
}
int main(){
    int n;
    cin>>n;
    cout<<fun(n);
} 