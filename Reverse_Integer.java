import java.util.*;
class Solution {
    public int reverse(int x) {
        long sum=0;

        while(x!=0)
        {
            int rem=x%10;
            x=x/10;
            sum=sum*10+rem;
        }

        if(sum> Integer.MIN_VALUE && sum<Integer.MAX_VALUE)
        {
            return (int)sum;
        }
        else{
            return 0;
        }
    }
}