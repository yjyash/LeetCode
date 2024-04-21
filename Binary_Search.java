class Solution {
    public int search(int[] nums, int target) {
        int l=0,u=nums.length-1;
        while(l<=u)
        {
            if(nums[(l+u)/2]==target)
            {
                return (l+u)/2;
            }
            else if(nums[(l+u)/2]>target)
            {
                u=(l+u)/2-1;
            }
            else
            {
                l=(l+u)/2+1;
            }
        }
        return -1;
    }
}