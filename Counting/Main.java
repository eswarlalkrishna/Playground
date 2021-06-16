/*#include<iostream>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;
int main()
{
	char s[100];
  	//cin>>s;;
  	getline(cin,s);
  	int i=0,v=0,c=0,wsp=0,d=0,sy=0,l=0;
  	while(s[i]!='\0')
      	i++;
  	l=i-1;
  	while(l>=0)
    {
    	if((s[l]>='a' && s[l]<='z') || (s[l]>='A' || s[l]<='Z'))
        {
        	if(s[l]=='a' || s[l]=='A' || s[l]=='e' || s[l]=='E' || s[l]=='i' || s[l]=='I' || s[l]=='o' || s[l]=='O' || s[l]=='u' || s[l]=='U')
        		v++;
          	else
              	c++;
        }
      	else
           	if(s[l]>=0 && s[l]<=9)
          		d++;
        else
        	if((s[l])==' ')
          		wsp++;
        else
      		sy++;
      	l++;
    }
  	cout<<"Vowels:"<<v<<endl;
  	cout<<"Consonants:"<<c<<endl;
  	cout<<"White Spaces:"<<wsp<<endl;
  	cout<<"Digits:"<<d<<endl;
  	cout<<"Symbols:"<<sy<<endl;
  	return 0;
}*/
#include<iostream>
using namespace std;
int main()
{
  char line[200];
    int vowels, consonant, digit, space, symbol;

    vowels = consonant = digit = space = symbol = 0;

    fgets(line, sizeof(line), stdin);

    for (int i = 0; line[i] != '\0'; ++i) 
    {
        if (line[i] == 'a' || line[i] == 'e' || line[i] == 'i' ||
            line[i] == 'o' || line[i] == 'u' || line[i] == 'A' ||
            line[i] == 'E' || line[i] == 'I' || line[i] == 'O' ||
            line[i] == 'U')
        {
            ++vowels;
        }
      else if ((line[i] >= 'a' && line[i] <= 'z') || (line[i] >= 'A' && line[i] <= 'Z')) 
      {
            ++consonant;
        } 
      else if (line[i] >= '0' && line[i] <= '9') 
      {
            ++digit;
        } 
      else if (line[i] == ' ') 
      {
            ++space;
        }
      else 
        symbol++;
    }
    cout<<"Vowels:" << vowels<<endl;
    cout<<"Consonants:"<< consonant<<endl;
  cout<<"White Spaces:" << space<<endl;
    cout<<"Digits:"<< digit <<endl;
  cout<<"Symbols:"<< symbol;
    
    return 0;
}