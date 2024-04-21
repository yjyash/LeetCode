class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>  ll= new ArrayList<>();
        List<List<Integer>> ans =new ArrayList<>();
        COs(candidates,target,ll,0,ans);
        return ans;
    }

    public static void COs(int [] coins , int amount , List<Integer> ll,int idx,List<List<Integer>> ans)
	{
		if(amount==0)
		{
			ans.add(new ArrayList(ll));
			return;
		}
		for(int i=idx;i<coins.length;i++) {
			if(amount>=coins[i])
			{
				ll.add(coins[i]);
				COs(coins,amount-coins[i], ll,i,ans);
				ll.remove(ll.size()-1);
			}
		}
	}
}