import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 static long primefactor(long n){
    long maxprime=0;
    while(n%2==0){
       maxprime=2;
      n=n/2;
    }
  for(int i=3;i<=Math.sqrt(n);i=i+2){
    while(n%i==0){
        maxprime=i;
     n=n/i;}
  }
  if(n>2)
       maxprime =n;
  return  maxprime;
  }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            System.out.println(primefactor(n));
        }
    }
}

