class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        parentheses(n,0,0,"",ll);
        return ll;
    }

    public static void parentheses(int n,int open,int close,String ans,List<String> ll)
	{
		
		if(open==n && close ==n)
		{
//			System.out.println(ans);
			ll.add(ans);
			return ;
		}
		
		if(open>n || close>open)
		{
			return;
		}
		
		parentheses(n,open+1,close,ans+"(",ll);
		parentheses(n,open,close+1,ans+")",ll);
		
	}
}