class Solution {
    public static boolean searchMatrix(int [][]arr,int item)
	{
		int row=arr.length-1;
		int col=0;
		
		while(row>=0 && col <arr[0].length)
		{
			if(arr[row][col]==item)
			{
				return true;
			}
			else if(arr[row][col]>item)
			{
				row--;
			}
			else {
				col++;
			}
		}
		return false;
	}
}