#include<bits/stdc++.h>
using namespace std;
int main()
{
  string s ;
  cin >> s ;
  sort ( s.begin() , s.end() ) ;
  int i , count ;
  for ( i = 0 ; s[i] ; i++ )
  {
    count = 1 ;					// eggloo
    while ( s[i] == s[i+1] )
    {
      count++ ;
      i++ ;
    }
    cout << s[i] << " " << count << endl ;
  }
  return 0 ;
}