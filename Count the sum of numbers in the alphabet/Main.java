#include<iostream>
#include<string>
using namespace std;
int main()
{
  string str ;
  getline ( cin , str ) ;
  int i , t , s = 0 ;
  for ( i = 0 ; str[i] ; i++ )
  {
    t = 0 ;
    while ( str[i] >= '0' && str[i] <= '9' )
    {
      	t = ( str[i] - 48 ) + t*10 ; // t = 33
    	i++ ;
    }
    	s = s + t ; // s = 33 + 1 = 34
  }
  cout << s ;
  return 0 ;
}