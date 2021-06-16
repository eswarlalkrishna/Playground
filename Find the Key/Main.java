#include<iostream>
using namespace std;
int small(int j,int k,int l)
{
	int th,h,t,o;
  	//min=max=0;
  	if((j/1000 < k/1000) && (j/1000 < l/1000))
  	    th=j/1000;
    else if((k/1000 < j/1000) && (k/1000 < l/1000))
        th=k/1000;
    else
        th=l/1000;
    j=j%1000;
    k=k%1000;
    l=l%1000;
    if((j/100 > k/100) && (j/100 > l/100))
  	    h=j/100;
    else if((k/100 > j/100) && (k/100 > l/100))
        h=k/100;
    else
        h=l/100;
    j=j%100;
    k=k%100;
    l=l%100;
    if((j/10 < k/10) && (j/10 < l/10))
  	    t=j/10;
    else if((k/10 < j/10) && (k/10 < l/10))
        t=k/10;
    else
        t=l/10;
    j=j%10;
    k=k%10;
    l=l%10;
    if((j > k) && (j > l))
  	    o=j;
    else if((k > j) && (k > l))
        o=k;
    else
        o=l;
    int key=1000*th+100*h+10*t+1*o;
    cout<<key;
}
int main()
{
	int a,b,c;
  	cin>>a>>b>>c;
    small(a,b,c);
  	return 0;
}