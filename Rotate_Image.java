class Solution {
    public void rotate(int[][] arr) {

        for(int row=0 ; row<arr.length ; row++)
		{
			for (int col=row +1 ; col<arr[0].length ; col++)
			{
				int temp = arr[row][col];
				arr[row][col]= arr[col][row];
				arr[col][row]=temp;
				
			}
		}
		
		
		
		int k;
		for(int row=0; row<arr.length ; row++)
		{
			int temp=arr[0].length-1;
			for(int col=0; col<=(arr[0].length/2)-1 ; col++)
			{
				k=arr[row][col];
				arr[row][col]=arr[row][temp];
				arr[row][temp]=k;
				temp--;
			}
		}
        
    }
}