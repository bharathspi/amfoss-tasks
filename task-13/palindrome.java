import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 static boolean ispalindrome(int k){
   String s = String.valueOf(k);
   String reverse = new StringBuffer(s).reverse().toString(); 
    if (s.equals(reverse)) 
      return true;
else 
  return false; 
  }
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int a[]=new int[1000001];
        int t = in.nextInt();
         int k=0;
            for(int i=100;i<1000;i++){
              for(int j=100;j<1000;j++){
                   k=i*j;
                  if(k>=101101&&ispalindrome(k))
                       a[k]=1;
                    else
                        a[k]=0;}}
      while(t>0){
        int n=in.nextInt();
       for(int i=n-1;i>=101101;i--){
         if(a[i]==1){
           System.out.println(i);
           break;
         }
       }
     t--; }
   }}
