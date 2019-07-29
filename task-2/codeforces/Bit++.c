#include<stdio.h>
int main(){
 int n,c=0;
 char a[4];
 scanf("%d",&n);
while(n>0){
    scanf("%s",a);
  if(a[0]=='-'||a[1]=='-'||a[2]=='-')
      c--;
   else
     c++;
     n--;
}
 printf("%d",c);
 return 0;}
