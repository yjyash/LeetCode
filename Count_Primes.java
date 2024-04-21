class Solution {
    public int countPrimes(int n) {
        if(n<2)
        {
            return 0;
        }
        return Prime_Sieve(n);
    }
    public static int Prime_Sieve(int n)
	{
		int c=0;
		boolean []prime=new boolean[n];
		prime[0]=true;
		prime[1]=true;
		for (int i = 2; i*i <= prime.length; i++) {
			if(prime[i]==false)//prime
			{
				for (int j = 2; i*j < prime.length; j++) {
					prime[i*j]=true;
				}
			}
		}
		for(int i=2;i<prime.length;i++)
		{
			if(prime[i]==false)
			{
				c++;
			}
		}
		return c;
	}
}