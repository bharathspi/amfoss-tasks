#include<stdio.h>
#include<stdlib.h>
int main(){
    long long int n; long long int t=0;long long int c=0;
  scanf("%lld",&n);
   long long int ar[n];

   for (long long int i = 0; i <= n-1; i++) {
     scanf("%lld", &ar[i]);}
     for(long long int i=1;i<=n-2;i++){
         if(ar[0]<ar[i+1]){
             t=ar[0];
             ar[0]=ar[i+1];
             ar[i+1]=t;
         }}

for (long long int i=0;i<=n-1;i++){
    if(ar[0]==ar[i]){
        c++;}
}
   printf("%lld",c);

return 0;}

