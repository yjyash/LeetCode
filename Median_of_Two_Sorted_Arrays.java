class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int [] merged = new int[length];
        int i=0;
        int j=0;
        int k=0;

        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                merged[k++]=nums1[i++];
            }
            else{
                merged[k++]=nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            merged[k++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            merged[k++]=nums2[j++];
        }
        double median=0.0;
        int idx=0;
        if(merged.length %2 ==0)
        {
            idx = (merged.length/2) -1;
            median =(merged[idx]+merged[idx+1])/2.0;

        }
        else{
            idx = (merged.length-1)/2;
            median= merged[idx];
        }
        return median;
    }
}