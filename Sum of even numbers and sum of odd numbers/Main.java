#include <iostream>
using namespace std;
int main() {
    
     int n,sumEven,sumOdd;
     sumEven=0;
     sumOdd=0;
     cin>>n;
     int arr[n];
     for(int i=1;i<=n;i++)
     {
              cin>>arr[i];
     }
     for(int i=1;i<=n;i++)
     {
         if(arr[i]%2==0)
         {
             sumEven=sumEven+arr[i];
         }
         else
         {
             sumOdd=sumOdd+arr[i];
         }
     }
     cout<<"The sum of the even numbers in the array is "<<sumEven<<endl;
     cout<<"The sum of the odd numbers in the array is "<<sumOdd;
}