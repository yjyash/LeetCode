class Solution {
    public int maximalRectangle(char[][] matrix) {
        int [][]m = new int[matrix.length][matrix[0].length];
        for(int i =0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                m[i][j]=Integer.parseInt(String.valueOf(matrix[i][j]));
            }
        }
        return code(m);
    }
    public static int code (int [][] matrix) {
		// TODO Auto-generated method stub		
		int [] arr = new int [matrix[0].length];
		int ans=0;
		for(int i=matrix.length-1;i>=0;i--)
		{
			if(i==matrix.length-1)
			{
				arr=matrix[i];
			}
			else {
				for(int j=0;j<matrix[0].length;j++)
				{
					arr[j]= matrix[i][j]==1 ? arr[j]+1 : 0 ;
				}
			}
			ans =Math.max(ans, Area(arr));
		}
		
		return ans;
			
		
	}
	
	public static int Area(int []arr) {
		Stack<Integer> st = new Stack<>();
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]<arr[st.peek()])
			{
				int h  =arr[st.pop()];
				int r=i;
				if(!st.isEmpty()) {
					int l=st.peek();
					ans= Math.max(ans, h*(r-l-1));
				}
				else {
					ans= Math.max(ans, h*r);
				}
			}
			
			st.push(i);
		}
		
		int r=arr.length;
		
		while(!st.isEmpty())
		{
			int h  =arr[st.pop()];
			if(!st.isEmpty()) {
				int l=st.peek();
				ans= Math.max(ans, h*(r-l-1));
			}
			else {
				ans= Math.max(ans, h*r);
			}
		}
		
		return ans;
	}
}