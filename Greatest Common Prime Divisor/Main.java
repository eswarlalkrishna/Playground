/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <math.h>
using namespace std;
int a,b;
int gcd(int m,int n){
    if(n!=0) return gcd(n,m%n); return m;
}
int prime(int n) {
   int f = -1;
   while (n % 2 == 0) {
      f = 2;
      n /= 2;
   }
   for (int i = 3; i <= sqrt(n); i += 2) {
      while (n % i == 0) {
         f = i;
         n = n / i;
      }
   }
   if (n > 2)
   f = n;
   return f;
}
int main()
{
    int i=1,r;
    cin>>a>>b;
    int k = gcd(a,b);
    cout<<prime(k);
    return 0;
}