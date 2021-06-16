#include <bits/stdc++.h>
using namespace std;

int main()
{
	int f = 1 , n ;
  	input:
  		cin >> n ;
  	if(n<2 || n >= 1000000)
    {
      	cout << "Number is invalid\n";
		goto input;	
    }
  	else
    {
        if(n%2==0&&n!=2) f=0 ;
        else
        {
     		for(int i = 2; i*i <= n; i++)
            {
            	if(n%i == 0)
                {
                  f = 0 ;
                  break ;
                }
            }
        }
    }
  	if(f) cout << "Given number is a prime number";
  	else cout << "Given number is not a prime number";
	return 0;
}