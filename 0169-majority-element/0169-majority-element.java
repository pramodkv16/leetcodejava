class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = -1;
        int value = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                int count = map.get(nums[i]);
                count++;
                map.put(nums[i], count);
                if(map.get(nums[i]) > max){
                    max = count;
                    value = nums[i];
                }
            }else{
                map.put(nums[i], 1);
            }
        }
        return value;
    }
}