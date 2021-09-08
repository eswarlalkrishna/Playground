#include <iostream>
using namespace std;
int main()
{
    int n,temp=0;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++)cin>>a[i];
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(a[i]>a[j])
            {
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }
    cout<<"Sorted array is:"<<endl;
    for(int i=0;i<n;i++)cout<<a[i]<<endl;
    return 0;
}