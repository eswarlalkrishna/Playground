#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
		int f = 0, n;
  		cin >> n;
  		for(int i = 1; i * i <= n; i++)
        {
        	f++;
        }
  		cout << f;
    return 0;
}