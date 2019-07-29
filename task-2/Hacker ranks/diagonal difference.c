#include<stdio.h>
#include<stdlib.h>
#include<math.h>
int main(){
    int n;int s1=0;int s2=0;int d;
    scanf("%d",&n);
    int arr[n][n];
    for (int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&arr[i][j]);
        }
    }
for(int i=0;i<n;i++){
    for(int j=0;j<n;j++){
        if(i==j){
            s1=s1+arr[i][j];
        }
    }
s2=s2+arr[i][n-1-i];}
d=abs(s1-s2);
printf("%d",d);
return 0;
}

