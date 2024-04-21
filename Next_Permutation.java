class Solution {
    public void nextPermutation(int[] nums) {
        permutation(nums);
    }
    public static void permutation(int arr[])
    {
        int p=-1;
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                p=i;
                break;
            }
        }
        if(p==-1){
            Reverse(arr,p+1,arr.length-1);
            return;
        }
        int q=-1;
        for(int i=arr.length-1;i>p;i--)
        {
            if(arr[i]>arr[p])
            {
                q=i;
                break;
            }
        }
        int temp=arr[p];
        arr[p]=arr[q];
        arr[q]=temp;
        Reverse(arr,p+1,arr.length-1);
    }
    public static void Reverse(int[] arr,int i,int j) {

		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
}
}