#include<iostream>
#include<cmath>
using namespace std;
int rob(int nums[],int n)
{
        if(nums == '\0' || n == 0)
            return 0;
       if(n == 1)
           return nums[0];
       if(n == 2)
           return max(nums[0],nums[1]);
        int a = 0;
        int b = 0;
        for (int i = 0; i < n; i++)
        {
            if(i % 2 == 0)
            {
                b = b + nums[i]; 
                b = max(a, b);
            } 
            else
            {
                a = a + nums[i];
                a = max(a, b);
            }
        }
        return max(a, b);
}
int main()
{
    int n;
    cin>>n;
    int a[n];
    int i=0;
    while(i<n)
    {
        cin>>a[i];
        i++;
    }
    cout<<rob(a,n);
    return 0;
}