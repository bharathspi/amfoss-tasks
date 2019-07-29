#include<stdio.h>
#include<stdlib.h>
int main(){
    int a[3];int b[3];
    for (int i=0;i<3;i++){
    scanf("%d",&a[i]);}
for (int i=0;i<3;i++){
    scanf("%d",&b[i]);}
int ali=0;int bob=0;
for(int i=0;i<3;i++){
    if(a[i]>b[i]){
         ali=ali+1;}
    else  if(a[i]<b[i]){
      bob=bob+1;  }
}
printf("%d %d",ali,bob);
return 0;
}
