class Solution {
    public int[] productExceptSelf(int[] nums) {

        int[] leftPrd = new int[nums.length];
        int[] rightPrd = new int[nums.length];
        int[] result = new int[nums.length];
        leftPrd[0]=1;
      
        rightPrd[nums.length -1] =1;
        for(int i=1; i < nums.length; i++){
            leftPrd[i] = leftPrd[i-1] * nums[i-1];
            rightPrd[nums.length-1-i] = rightPrd[nums.length-i] * nums[nums.length-i];
        }
         for(int i=0; i < nums.length; i++){
            result[i] = leftPrd[i] * rightPrd[i];
         }
         return result;
    }
}  
