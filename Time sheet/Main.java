#include<iostream>
using namespace std;
int main()
{
	double su,m,tu,w,th,f,sa,sal;
  	sal=0;
  	cin>>su>>m>>tu>>w>>th>>f>>sa;
  	if(m>24 ||tu>24 || w>24 || th>24 ||f>24 || sa>24 || su>24)
      	return 0;
  	if((su<0 && su>24)|| (m<0 && m>24)|| (tu<0 && tu>24) || (w<0 && w>24) || (th<0 && th>24) || (f<0 &&f>24) || (sa<0 && sa>24))
      	return 0;
  	if((m+tu+w+th+f)>40)
      	sal=sal+25*((m+tu+w+th+f+sa+su)-40);
  	//float cal(float inp)
    if(m<=8)
        sal=sal+100*m;
  	else
      	sal=sal+100*m+15*(m-8);
    if(tu<=8)
        sal=sal+100*tu;
  	else
      	sal=sal+100*tu+15*(tu-8);
    if(w<=8)
        sal=sal+100*w;
  	else
      	sal=sal+100*w+15*(w-8);
    if(th<=8)
        sal=sal+100*th;
  	else
      	sal=sal+100*th+15*(th-8);
    if(f<=8)
        sal=sal+100*f;
  	else
      	sal=sal+100*f+15*(f-8);
  	if(sa>0)
      	sal=sal+1.25*100*sa;
  	if(su>0)
      	sal=sal+1.5*100*su;
  	cout<<(int)sal;
  	return 0;     	
}