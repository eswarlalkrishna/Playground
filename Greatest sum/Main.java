#include<iostream>
using namespace std;
int main()
{
  int row , col , i , j , s , index , max ;
  cin >> row >> col ;		// Taking row & col of matrix
  int a[row][col] ;			// Declaring 2D Array for Matrix
  for ( i = 0 ; i < row ; i++ )
  {
    for ( j = 0 ; j < col ; j++ )
      cin >> a[i][j] ;		// Getting elements of Matrix
  }
  cout << "Sum of rows is " ;
  for ( i = 0 ; i < row ; i++ )	// Finding sum of rows
  {
    s = 0 ;
    for ( j = 0 ; j < col ; j++ )
    {
      s = s + a[i][j] ;
    }
    cout << s << " " ;
    if ( i == 0 )
    {
      max = s ;		// Loading the first row sum to max by default and storing the index
      index = i ;
    }
    else
    {
      if ( s > max )
      {
        max = s ;	// Loading the max with current sum, if it is greater than previous sum and storing the index
        index = i ;
      }
    }
  }
  cout << "\nRow "<< index + 1 <<" has maximum sum\n" ;
  cout << "Sum of columns is " ;
  for ( i = 0 ; i < col ; i++ )	// Finding sum of columns
  {
    s = 0 ;
    for ( j = 0 ; j < row ; j++ )
    {
      s = s + a[j][i] ;
    }
    cout << s << " " ;
    if ( i == 0 )
    {
      max = s ;		// Loading the first col sum to max by default and storing the index
      index = i ;
    }
    else
    {
      if ( s > max )
      {
        max = s ;	// Loading the max with current sum, if it is greater than previous sum and storing the index
        index = i ;
      }
    }
  }
  cout << "\nColumn "<< index + 1 <<" has maximum sum" ;
  return 0 ;
}