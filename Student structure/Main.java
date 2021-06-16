/*#include<iostream>
using namespace std;
struct grd
{
  	int rn,gr;
  	int sub[5];
  	float avg;
};
int main()
{
 	struct grd s[20];
  	int n,i,j;
  	cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  	cout<<"Enter the no of students"<<endl;
  	cin>>n;
  	while(i<n)
  	{
    	cin>>s[i].rn;
    	cin>>s[i].sub[0]>>s[i].sub[1]>>s[i].sub[2]>>s[i].sub[3]>>s[i].sub[4];
      	i++;
  	}
  	cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  	while(i<n)
  	{ 
    	s[i].avg=(s[i].sub[0]+s[i].sub[1]+s[i].sub[2]+s[i].sub[3]+s[i].sub[4])/5;
    	if(s[i].avg>70)
    	{ 
          	s[i].gr=1;
        }
    	if(s[i].avg>50 && s[i].avg<70)
    	{
          	s[i].gr=2;
        }
    	if(s[i].avg<50)
    	{
          	s[i].gr=3;
        }
    	cout<<s[i].rn<<" "<<s[i].sub[0]<<" "<<s[i].sub[1]<<" "<<s[i].sub[2]<<" "<<s[i].sub[3]<<" "<<s[i].sub[4]<<" "<<s[i].avg<<" "<<s[i].gr<<endl;
      	i++;
  	}
}*/
#include<iostream>
using namespace std;
struct grd
{
  int rn,gr;
  int sub[5];
  float avg;
};
int main()
{
  struct grd s[20];
  int n,i,j;
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>s[i].rn;
    cin>>s[i].sub[0]>>s[i].sub[1]>>s[i].sub[2]>>s[i].sub[3]>>s[i].sub[4];   
  }
  cout<<"rn s1 s2 s3 s4 s5 avg grade"<<endl;
  for(i=0;i<n;i++)
  { 
    s[i].avg=(s[i].sub[0]+s[i].sub[1]+s[i].sub[2]+s[i].sub[3]+s[i].sub[4])/5;
    if(s[i].avg>70)
    { s[i].gr=1;}
    if(s[i].avg>50 && s[i].avg<70)
    { s[i].gr=2;}
    if(s[i].avg<50)
    {s[i].gr=3;}   
    cout<<s[i].rn<<" "<<s[i].sub[0]<<" "<<s[i].sub[1]<<" "<<s[i].sub[2]<<" "<<s[i].sub[3]<<" "<<
         s[i].sub[4]<<" "<<s[i].avg<<" "<<s[i].gr<<endl;
  }
}