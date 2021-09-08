#include<iostream>
using namespace std;
int main()
{
  int n ;
  cin >> n ;  
  int a[n] , i , count = 1 ;
  for ( i = 0 ; i < n ; ++i )
  {
    cin >> a[i] ;
    
    if ( i == 0 )
      cout << "1" << endl ;
    else
    {
      if ( a[i] < a[i-1] )
        cout << "1" << endl ;
      else
      {
        cout << count*2 << endl ;
        count++ ;
      }
    }
  }
  return 0 ;
}