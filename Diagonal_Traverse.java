class Solution {
    public int[] findDiagonalOrder(int[][] arr) {
        int n=arr.length;
		int m=arr[0].length;
		int []ans = new int[n*m];
		int i=0;
		for(int d=0;d<n+m-1 ; d++)
		{
			int r=0,c=0;
			if(d<m)
			{
				c=d;
			}
			else {
				c=m-1;
				r=d-m+1;
			}
			
			ArrayList<Integer> ll =new ArrayList<>();
			while(r<n && c>=0)
			{
				ll.add(arr[r][c]);
				r++;
				c--;
			}
			if(d%2==0)
			{
				Collections.reverse(ll);
			}
			//System.out.println(ll);
			for(int val:ll)
			{
				ans[i++]=val;
			}
		}
		return ans;
    }
}