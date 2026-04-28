class Solution {
    public int singleNumber(int[] nums) {
        int product = 0;
        for(int num: nums){
            product = product ^ num;
        }
        return product;
    }
}
