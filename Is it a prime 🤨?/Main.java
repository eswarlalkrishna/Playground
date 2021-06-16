#include<iostream>
#include<cmath>
using namespace std;
long int prime ( long int num , long int divisor ) // 5 , 2 // 5 , 1
{
  if ( divisor == 1 )
    return 1 ;
  else if ( num % divisor == 0 )
    return 0 ;
  else 
    prime ( num , divisor - 1 ) ; // 5 , 1
}
int main()
{
  long int n , flag , divisor ;
  cin >> n ;
  if(n<1 || n>(pow(10,10)))
    return 0;
  divisor = sqrt(n) ;
  flag = prime ( n , divisor ) ;
  if ( flag == 1 )
    cout << "Prime" ;
  else
    cout << "Not Prime" ;
  return 0 ;
}