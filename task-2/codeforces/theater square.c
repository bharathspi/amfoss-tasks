#include<stdio.h>
#include<math.h>
int main(){
double l,m,a;
scanf("%lf%lf%lf",&l,&m,&a);
long long int n;
n=ceil(l/a)*ceil(m/a);
printf("%I64d",n);
return 0;}
