class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
        Set<Integer> seen = new HashSet<>();
        while(n > 0){
            int reminder = n%10;
            n = n /10;
            sum = sum + (reminder * reminder);
            System.out.println(sum);
            if( n == 0) {
                n = sum;
                if(sum ==1){
                    return true;
                }
                if(!seen.add(sum)){
                    return false;
                }
                sum=0;
            }
        }
        return false;
    }
}
