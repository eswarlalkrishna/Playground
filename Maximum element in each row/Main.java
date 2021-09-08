#include<iostream>
using namespace std;
int main()
{
   int m , n , i , j , max ;
  cin >> m >> n ;
  int mat[m][n] ;
  for ( i = 0 ; i < m ; i++ )
  {
    for ( j = 0 ; j < n ; j++ )
      cin >> mat[i][j];
  }
  for ( i = 0 ; i < m ; i++ ) 	
  {
    for ( j = 0 ; j < n ; j++ )	
    {
      if ( j == 0 )
        max = mat[i][j] ;		//max = 1
      else
      {
        if ( mat[i][j] > max )	// 2 > 1
          max = mat[i][j] ;		// max = 2 
      }
    }
    cout << max << endl ;
  }
  return 0 ;
}