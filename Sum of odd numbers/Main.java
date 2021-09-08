#include<iostream>
using namespace std;
int sum_of_odd ( int a[] , int size ) // function definition
{
  static int i = 0 ;
  if ( i == size )
    return 0 ;
  else if ( a[i] % 2 == 1 )
  { 
    i++;
    return a[i-1] + sum_of_odd ( a , size ) ; // recursive call 
  }
  else
  {
    i++ ;
    sum_of_odd ( a , size ) ;
  }
}
int main()
{
  int size , i ;
  cout << "Enter the number of elements in the array" ;
  cin >> size ; 		// getting the size of array 
  int a[size] ;			// Declaring the array
  cout << "\nEnter the elements in the array" ;
  for ( i = 0 ; i < size ; i++ )
    cin >> a[i] ;		// Getting array elements
  int odd_sum = sum_of_odd ( a , size ) ; // function call 
  // This will take the return value of the recursion fn
  cout << "\nThe sum of the odd elements in the array is " << odd_sum ;
  return 0;
}