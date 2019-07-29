#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
char a[101];
scanf("%s",a);
if(strstr(a,"1111111")||strstr(a,"0000000"))
    printf("YES");
else
    printf("NO");

return 0;}
