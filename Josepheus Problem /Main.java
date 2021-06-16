#include <iostream> 
using namespace std; 
int mojo(int n, int k) 
{ 
	if (n==1) 
		return 1; 
	else
		return (mojo(n-1, k) + k-1)%n+1; 
} 
int main() 
{ 
	int n,k;
  	cin>>n>>k;
	cout<<mojo(n, k); 
	return 0; 
}
