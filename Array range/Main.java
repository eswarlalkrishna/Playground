#include<iostream>
using namespace std;
int main()
{
int n, temp;
  	cout << "Enter the number of elements in the array" << endl;
  	cin >> n;
  	int a[n];
  	cout << "Enter the elements in the array" << endl;
  	for (int i  = 0; i < n; i++) cin >> a[i];
  	for (int i  = 0; i < n; i++){
    	for (int j = i + 1; j <  n; j++){
        	if(a[i] > a[j]){
            	temp = a[i];
              	a[i] = a[j];
              	a[j] = temp;
            }
        }
    }
  	cout << "The range of the array is "  << a[n-1] - a[0];
  	return 0;
}