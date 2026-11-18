class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int occurance = 1;
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(map.containsKey(val)) {
                map.put(val, occurance + 1);
            } else {
                map.put(val, occurance);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.get(num) == 1) {
                return num;
            }
        }
        return -1;

    }
}