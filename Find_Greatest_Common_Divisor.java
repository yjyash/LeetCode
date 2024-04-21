class Solution {
    public int findGCD(int[] nums) {
        int min=nums[0],max=nums[0],x=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min)
            min=nums[i];
            if(nums[i]>max)
            max=nums[i];
        }
        int divisior=max,dividend=min;
        while(dividend%divisior!=0)
        {
            int rem=dividend%divisior;
            dividend=divisior;
            divisior=rem;
        }
        return divisior;
    }
}