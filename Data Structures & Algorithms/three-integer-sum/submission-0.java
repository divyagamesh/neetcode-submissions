class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        for(int i=0;i<nums.length;  i++){
            int startNum = nums[i];
            Map<Integer,Integer> store = new HashMap<>();
            for(int j=0;j<nums.length;j++){
                if(i==j){
                    continue;
                }
                int requiredNum = -(nums[i]+nums[j]);
                if(store.containsKey(requiredNum)){
                    List<Integer> subResult = new ArrayList<>();
                    subResult.add(nums[i]);
                    subResult.add(nums[j]);
                    subResult.add(requiredNum);
                    Collections.sort(subResult);
                    result.add(subResult);
                }else{
                    store.put(nums[j],j);
                }
            }

        }
        return new ArrayList(result);
    }
}
