class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagram = new HashMap<>();
        for(String str:strs){
            char[] sortedCharArr =  str.toCharArray();
            Arrays.sort(sortedCharArr);
            String sortedStr = new String(sortedCharArr);
            if(anagram.containsKey(sortedStr)){
                anagram.get(sortedStr).add(str);
            }else {
                List<String> anagLst = new ArrayList<>();
                anagLst.add(str);
                anagram.put(sortedStr, anagLst);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(List<String> anagList : anagram.values()){
            result.add(anagList);
        }
        return result;
    }
}
