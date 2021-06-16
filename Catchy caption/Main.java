#include <cstring>
#include <iostream>
using namespace std;
int main()
{
	char str[100];
  	int i,c;
  	i=c=0;
  	cin.getline(str,100);
  	while(i<strlen(str)){
    if(str[i]==' ') c++;
    i++;
    }
  	(c<=10)? cout<<"Caption eligible for the contest":cout<<"Caption not eligible for the contest";
   	return 0;
}