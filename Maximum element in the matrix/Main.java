#include<iostream>
using namespace std;
int main()
{
   int m , n , i , j ;
  cin >> m >> n ;
  int mat[m][n] ;
  for ( i = 0 ; i < m ; i++ )
  {
    for ( j = 0 ; j < n ; j++ )
      cin >> mat[i][j];
  }
  int max;
  max = mat[0][0];
  for ( i = 0 ; i < m ; i++ ) 	
  {
    for ( j = 0 ; j < n ; j++ )	
    {
      if ( mat[i][j] > max )
        max = mat[i][j] ;
    }
  }
    cout << "The maximum element is " << max << endl ;
  return 0 ;
}