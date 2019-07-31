import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
      long sum1=0,sum2=0,sum3=0,req=0;
       long  n1,n2,n3;
        Scanner obj=new Scanner(System.in);
        long t=obj.nextInt();
        while(t>0){
         long n=obj.nextLong();
         n--;
     n1=n/3;n2=n/5;n3=n/15;
     sum1=(3*n1*(n1+1))/2;
    sum2=(5*n2*(n2+1))/2;
     sum3=(15*n3*(n3+1))/2;
    req=sum1+sum2-sum3;
      System.out.println(req);
      t--;
}}

        }

