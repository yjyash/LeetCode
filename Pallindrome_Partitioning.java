class Solution {
    public List<List<String>> partition(String s) {
        List<String> ll = new ArrayList<>();
        ArrayList<List<String> > ll2 = new ArrayList<List<String> >();
        partition(s,ll,ll2);
        return ll2;
    }

    public static void partition(String ques,List<String> ll,ArrayList<List<String> > ll2){
        if(ques.length()==0){
            ll2.add(new ArrayList<>(ll));
            return;
        }

        for(int i=1;i<=ques.length();i++){
            String s=ques.substring(0,i);
            if(isPalindrome(s)) {
                ll.add(s);
                partition(ques.substring(i),ll,ll2);
                ll.remove(ll.size()-1);
            }
        }
    }

    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}