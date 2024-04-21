import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        Rotate_Array(nums,k);
    }

  public static void Rotate_Array(int []arr,int k)
	{
		int n=arr.length;
		k=k%n;
		Reverse( arr , 0 , n-k-1);//first n-k elements
		Reverse( arr , n-k , n-1);//last k elements
		Reverse(arr, 0, n-1);//All elements
	}
	
	public static void Reverse(int [] arr,int a, int b)
	{
		int i=a;
		int j=b;
		
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}