class Solution {
    public String mergeAlternately(String word1, String word2) {
        String n = "" ;
        int k=0;
        int i=0;
        int j=0;

        while(i<word1.length() && j<word2.length())
        {
            n = n+ word1.charAt(i++) + word2.charAt(j++);
        }
        while(i<word1.length())
        {
            n = n+ word1.charAt(i++);
        }

        while(j<word2.length())
        {
            n = n+ word2.charAt(j++);
        }
        return n;

    }
}