class Solution {
    public int search(int[] nums, int target) {
        int left =0;
        int right = nums.length-1;
        int index = (nums.length)/2;
        System.out.println(index);
        while(left<=right){
            if(nums[index] == target){
                return index;
            }else if(nums[index] < target){
                left = index+1;
            }else{
                right = index-1; 
            }
            index = (left+right)/2;

        }
        return -1;
    }
}
