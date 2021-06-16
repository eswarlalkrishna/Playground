#include<iostream>
#include<cstring>
using namespace std;
int main()
{
	char c[20];
  	int i;
  	cin>>c;
  	/*while(i<strlen(c))
    {
    	cin>>c[i];
      	i++;
    }*/
  	cout<<"String in lowercase is ";
  	while(i<strlen(c))
    {
    	putchar(tolower(c[i]));
      	i++;
    }
  	return 0;
}