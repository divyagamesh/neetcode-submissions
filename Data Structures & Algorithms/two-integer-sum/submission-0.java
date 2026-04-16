class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> store = new HashMap<>();
        int expectedNum;
        for(int i=0;i < nums.length; i++){
            expectedNum = target - nums[i];
            if(store.containsKey(expectedNum)){
                return new int[]{store.get(expectedNum), i};
            } else{
                store.put(nums[i],i);
            }

        }
        return new int[]{0,0};
    }
}
