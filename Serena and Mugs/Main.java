#include<iostream>
using namespace std;
int main()
{
	int n, v, s  = 0;
  	cin >> n >> v;
  	int a[n];
  	for (int i = 0; i <  n; i++){
      cin >> a[i];
      s += a[i];
    }
  	if (s <=  v) cout << "YES";
  	else cout << "NO";
  	return 0;
}