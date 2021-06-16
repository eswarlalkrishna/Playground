#include<iostream>
using namespace std;
int search_element ( int a[] , int search , int size )
{
  static int i = 0 ;
  if ( a[i] == search )
    return 1 ;
  else if ( i == size )
    return 0 ;
  i++ ;
  search_element ( a , search , size ) ;
}
int main()
{
  int size , i , search ;
  cin >> size ; 		// getting the size of array 
  int a[size] ;			// Declaring the array
  for ( i = 0 ; i < size ; i++ )
    cin >> a[i] ;		// Getting array elements
  
  cin >> search ; 		// Getting search element
  int search_flag = search_element ( a , search , size ) ; 
  // This flag will take the return value of the recursion fn
  if ( search_flag == 1 )
    cout << search ;
  else
    cout << "The number is not present in the list" ;
  return 0 ;
}