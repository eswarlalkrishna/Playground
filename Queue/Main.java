/*#include<iostream>
using namespace std;
int main()
{
	int n,m,i=0,c=0;
  	cin>>n,m;
  	int a[n];
  	while(i<n)
    {
    	cin>>a[i];
      	i++;
    }
  	i=0;
  	while(i<n)
    {
    	if((a[i]<=m) || ((a[i]+a[i+1])<=m))
          	c++;
      	i++;
    }
  	cout<<c;
  	return 0;
}*/
#include<iostream>
using namespace std;
 
int main()
{
  int n , m , i , bus = 0 ;
  cin >> n >> m ;     // the bus capacity
  
  int a[n] , sum ;     // n is the size of array / number of groups
  
  for ( i = 0 ; i < n ; i++ )
    cin >> a[i] ;
  
  for ( i = 0 ; i < n ; i++ )
  {
    sum = 0 ;
    if ( a[i] == m )    // g = 5 m = 10 
      bus++ ;            // 2 3 4 5 6 
    else
    {
      while ( sum < m )
      {
        sum = sum + a[i] ; // 11
        i++ ;            // 4 
      }
      if ( sum == m )
      {
        bus++ ;
        i-- ; //3    
      }
      else
      {
       bus++ ;        // 2
       i -= 2 ;
      }
    }
  }
  cout << bus ;
  
  return 0 ;
}