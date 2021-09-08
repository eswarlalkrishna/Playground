#include<iostream>
 using namespace std;
 int main() {
 int n, count = 0 , evencount = 0, oddcount = 0;
 cout << "Enter the number of elements in the array" << endl;
 cin >> n; int a[n];
 cout << "Enter the elements in the array" << endl;
 for (int i = 0; i < n; i++){
 cin >> a[i];
 count += 1;
 if(a[i]%2 == 0) evencount += 1; 
else oddcount += 1;
 }
 if(count == evencount) cout << "The array is Even" <<endl;
else if(count == oddcount) cout << "The array is Odd" <<endl;
 //else cout << "The array 
 else cout << "The array is Mixed" <<endl;
 return 0;
 }