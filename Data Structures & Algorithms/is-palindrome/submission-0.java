class Solution {
    public boolean isPalindrome(String s) {
       
       int left = 0;
       int right = s.length() -1;

       while(left < right){
            if(left < right && !Character.isLetterOrDigit(s.charAt(left))){
                System.out.println("left nonlorD -" +s.charAt(left));
                left++;
            }else if(left < right && !Character.isLetterOrDigit(s.charAt(right))){
                System.out.println("right nonlorD -" +s.charAt(right));
                right--;
            }else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                System.out.println("not equal -" +s.charAt(left)+ "--"+s.charAt(right));
                return false;
            }else{
                System.out.println("equal -" +s.charAt(left)+ "--"+s.charAt(right));
                left++;
                right--;
            }

       }
       return true;
    }
}
