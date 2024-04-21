class Solution {
    public int findKthLargest(int[] nums, int k) {
        return k(nums,k);
    }
    public static int k(int []arr,int k)
    {
        int a = arr.length-1;
        Arrays.sort(arr);
        int max = 0;
        // for(int i=arr.length-1; i>=0;i--)
        // {
            while(k>0){
                max = arr[a];
                k--;
                a--;
            }
        // }
        return max;
    }
}