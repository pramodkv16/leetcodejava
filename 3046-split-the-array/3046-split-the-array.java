class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int value = nums[i];
            if(map.containsKey(value)) {
                int currentValue = map.get(value);
                map.put(value, currentValue + 1);
            } else {
                map.put(value, 1);
            }
            if(map.get(value) > 2) {
                return false;
            }

        }
        return true;
    }
}