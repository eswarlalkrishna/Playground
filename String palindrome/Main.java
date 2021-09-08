#include<iostream>
using namespace std;
int main()
{
  string s ;
  cin >> s ;
  int l = 0 ;
  while ( s[l++] != '\0' ) ;
  l-- ;
  int palindrome = 1 ;
  for ( int i = 0 ; i <= l/2 ; i++ )
  {
    if ( s[i] != s[l-1 - i] )
    {
      palindrome = 0 ;
      break ;
    } 
  }
  if ( palindrome == 1 )
    cout << "Palindrome" ;
  else
    cout << "Not a Palindrome" ;  
  return 0 ;
}