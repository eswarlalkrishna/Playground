#include<iostream>
using namespace std;
int main()
{
  int a[10], b[10], n, i, j, k = 0;
    cin >> n;
    for (i = 0; i < n; i++)
        cin >> a[i];    
    for (i = 0; i < n; i++)
    {
        for (j = 0; j < k; j++)
        {
            if (a[i] == b[j])
                break;
        }
        if (j == k)
        {
            b[k] = a[i];
            k++;
        }
    }
    for (i = 0; i < k; i++)
        cout << b[i] << endl;
  
}