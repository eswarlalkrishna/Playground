#include <iostream>

using namespace std;

int main()
{
     int n,p,sum1=0,sum2=0; 
//cout << "Enter the size of the array :";
 cin >> n; // size of the array
//cout << "Enter the size of the array :";
 cin >> p; // size of the array
 int a[n],b[p]; // declaration of array of size n
 for (int i = 0; i < n; i++){ 
//cout << "Enter the elements of the array " << i + 1 << ": "; 
cin >> a[i];
sum1 += a[i];
 } 
 for (int i = 0; i < p; i++){ 
//cout << "Enter the elements of the array " << i + 1 << ": "; 
//cin >> a[i]
cin >> b[i]; 
sum2 += b[i];
 } 
if(n==p && sum1==sum2)
{
 cout<<"Same";
}
else
{
cout<<"Not Same";
}
return 0;
}