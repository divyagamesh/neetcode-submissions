class Solution {

    public String encode(List<String> strs) {
        String encodedStr = "";
        for(String st : strs){
            encodedStr = encodedStr+st.length()+"#"+st;
        }
        return encodedStr;
    } 

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        while(!str.isEmpty()){
            int hashIndex = str.indexOf('#');
            int len = Integer.parseInt(str.substring(0,hashIndex));
            String temp = str.substring(hashIndex+1, hashIndex+1+len);
            str = str.substring(hashIndex+1+len);
            result.add(temp);
        }
        
    return result;
    }
}
