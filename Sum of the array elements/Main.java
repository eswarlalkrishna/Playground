#include<iostream>
using namespace std;
int Sum ( int a[] , int n )
{
  static int i = 0 , sum = 0 ;
  if( i == n )
    return sum ;
  else
  {
  sum = sum + a [ i ] ;
  i++ ;
  }
  Sum ( a , n ) ;
}
int main()
{
  int n , i ;
  cin >> n ; 
  int a[n] ;
  for ( i = 0 ; i < n ; i++ )
    cin >> a[i] ; 
  cout << Sum ( a , n ) ;
  return 0;
}