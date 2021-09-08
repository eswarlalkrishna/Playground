#include <iostream>
using namespace std;
int main()
{
	char str[100], rev[100];     
	int count = 0, end, i=0;
	cin.getline(str,100);
	while(str[count]!='\0')
	{
	    count++;
	}
	end=count-1;
  	while(i<=count)
  	{
    	rev[i]=str[end];
      	end--;
      	i++;
    }
    end=i-1;
    count=0;
    while(count<end)
    {
        cout<<rev[count];
        count++;
    }
  	rev[count]='\0';
	return 0;
}