#include<iostream>
using namespace std;
int main()
{
  int n ;
  cin >> n ;
  int a[n][n] , i , j , s1 = 0 , s2 = 0 , k ;
  for ( i = 0 ; i < n ; i++ )
  {
    for ( j = 0 ; j < n ; j++ )
      cin >> a[i][j] ;
  }
  for ( i = 0 , j = 0 , k = n - 1 ; i < n ; i++ , j++ , k-- )
  {
    s1 = s1 + a[i][j] ;	// Sum of Forward Diagonal
    s2 = s2 + a[i][k] ;	// Sum of Backward Diagonal
  }
  if ( s1 == s2 )
    cout << "Yes" ;
  else
    cout << "No" ;
  return 0 ;
}