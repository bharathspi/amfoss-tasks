#include<stdio.h>
#include<string.h>
void main(){
char a[101];
int n;
scanf("%d",&n);
while(n--){
  scanf("%s",a);
 if(strlen(a)>10)
    printf("%c%d%c\n",a[0],strlen(a)-2,a[strlen(a)-1]);
 else
    printf("%s\n",a);
}
}
