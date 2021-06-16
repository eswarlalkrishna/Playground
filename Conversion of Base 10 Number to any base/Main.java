#include<iostream>
using namespace std;
void convert ( int number , int base ) // 10 , 3 // 3 , 3 // 1 , 3 
{
  if ( number < base )	// 10 < 3 // 3 < 3 // 1 < 3 
    cout << number ;
  else
  {
    convert ( number/base , base ) ; 	// 3 , 3 // 
    cout << number % base ;				// 10 % 3
  }
}
int main()
{
  int n , b ;
  cout << "Enter the value of n" ;
  cin >> n ;
  cout << "\nEnter the base to which you want to convert" ;
  cin >> b ;
  cout << "\nThe number in base " << b << " is " ;
  convert ( n , b ) ;  
  return 0 ;
}