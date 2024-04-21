class Solution {
    public boolean isPrime(int num)
    {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int maxPrime = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (isPrime(nums[i][i]))
            {
                maxPrime = Math.max(maxPrime, nums[i][i]);
            }
        }
        for (int i = 0; i < nums.length; i++) 
        {
            if (isPrime(nums[i][nums.length - i - 1])) 
            {
                maxPrime = Math.max(maxPrime,nums[i][nums.length - i - 1]);
            }
        }
        return maxPrime;
}
}