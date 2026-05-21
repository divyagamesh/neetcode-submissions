class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> store = new LinkedHashSet<>();
        int longest=0;
        int left = 0;
        int right=0;
        int streak =0;
        if(s.length() ==1){
            return 1;
        }
        while(left <= right && right < s.length()){
            if(store.add(s.charAt(right))){
                streak++;
                right++;
            }else{
                do{
                    store.remove(s.charAt(left));
                    left++;
                }while(s.charAt(left-1) != s.charAt(right));
                longest = Math.max(streak, longest);
                streak=right-left;
                
            }
        }
        return Math.max(streak, longest);
    }
}