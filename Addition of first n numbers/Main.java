#include<iostream>
using namespace std;
int sum ( int n ) 	// Function definition 5 4 3 2 1
{
  if ( n == 0 || n == 1 )
    return n ;
  else
    return n + sum ( n-1 ) ; // return 5 + 4 + 3 + 2 + 1
}   
int main() {
	int n , i = 1 , j = 0 ;
  	cin >> n ;		// n = 5 
  	cout << sum ( n ) ;		// Function call ( 5 )
  	return 0 ;
}