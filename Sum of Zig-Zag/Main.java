#include<iostream>
using namespace std;
int main()
{
  int row , col , i , j ;
  cin >> row >> col ;
  int matrix[row][col] , sum = 0 , k , l , max ;
  for ( i = 0 ; i < row ; i++ )
  {
    for ( j = 0 ; j < col ; j++ )
      cin >> matrix[i][j] ;
  }
  for ( i = 0 , j = 0 , k = row - 1 , l = 0 ; l < row && j < col ; l++ , j++ )
  {
    sum = sum + matrix[i][j] ; // Sum of First row	
    sum = sum + matrix[k][j] ; // Sum of Last row
    if ( l == j && l != i && l != k )
      sum = sum + matrix[l][j] ; // Adding Diagonal except First & Last row
  }
  cout << "Sum of Zig-Zag pattern is " << sum ;	
  return 0 ;
}