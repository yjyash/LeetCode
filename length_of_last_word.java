class Solution {
    public int lengthOfLastWord(String s) {
        int l=0;
        String st = s.trim();
        for( int i=st.length()-1;i>=0;i--)
        {
            if(st.charAt(i)==' ')
            {
                break;
            }
            l++;
        }
        return l;
    }
}