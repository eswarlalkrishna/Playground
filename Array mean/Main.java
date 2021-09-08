#include<iostream>
using namespace std;
int main()
{
	int n, sum = 0;
  	cout << "Enter the number of elements in the array" << endl;
  	cin >> n;
  	if ( n > 20 ){
      	cout << "Invalid input";
  		return 0;
    }
  	int a[n];
  	cout << "Enter the elements in the array" << endl;
  	for (int i = 0; i < n; i++){
    	cin >> a[i];
      	sum += a[i];
    }
  	cout << "The mean of the array is " << sum/n;
  	return 0;
}