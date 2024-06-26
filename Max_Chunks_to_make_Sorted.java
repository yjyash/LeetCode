class Solution {
    public int maxChunksToSorted(int[] arr) {
        int rmin[]=new int[arr.length+1];
       int c=0;
       rmin[arr.length]=Integer.MAX_VALUE;
       for(int i=arr.length-1;i>=0;i--){
           rmin[i]=Math.min(rmin[i+1],arr[i]);
       }
       int leftmax=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
           leftmax=Math.max(leftmax,arr[i]);
           if(leftmax<=rmin[i+1]){
               c++;
           }
       }
       return c;
    }
}