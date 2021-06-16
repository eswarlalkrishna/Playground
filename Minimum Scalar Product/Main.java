#include<iostream>
using namespace std;
int main()
{
  int size ,i , temp , j , sum = 0 ;
  cin >> size ;
  int a[size] , b[size] ;
  for ( i = 0 ; i < size ; i++ )
    cin >> a[i] ;
  for ( i = 0 ; i < size ; i++ )
    cin >> b[i] ;
for ( i = 1 ; i < size ; i++ )
  {
    for ( j = 0 ; j < i ; j++ )
    {
      if ( a[i] < a[j] )
      {
        temp = a[i] ;
        a[i] = a[j] ;
        a[j] = temp ;
      }
      if ( b[i] < b[j] )
      {
        temp = b[i] ;
        b[i] = b[j] ;
        b[j] = temp ;
      }
    }
  }
for ( i = 0 ; i < size ; i++ )
    sum = sum + a[i]*b[i] ;
  cout << sum ;
  return 0 ;
}