import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static long gcd(long a, long b) 
{ 
   if(a%b != 0)  
      return gcd(b,a%b); 
   else 
      return b; 
} 
static long lcm(long n) 
{ 
    long ans = 1;     
    for (long i = 1; i <= n; i++) 
        ans = (ans * i)/(gcd(ans, i)); 
    return ans; 
} 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            System.out.println(lcm(n));
        }
    }
}

