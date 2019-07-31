import java.util.Scanner;
public class Solution {
  static long fib(long n) 
{ long sum  = 0;
long fn0 = 0;
long fn1 = 1;
long fn2;

while ((fn2 = fn0 + fn1) < n)
{
    if (fn2 % 2 == 0)
        sum += fn2;
    fn0 = fn1;
    fn1 = fn2;
}
 return sum; }
 
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int t = obj.nextInt();
        while(t>0){
            long n = obj.nextLong();
            long req=fib(n);
         System.out.println(req);
         t--;
        }
    }
}

