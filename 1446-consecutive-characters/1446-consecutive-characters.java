class Solution {
    public int maxPower(String s) {
        int maxCount = 1;
        int count = 1;
        if(s.length() == 1) {
            return 1;
        }
        for(int i = 0; i < s.length() - 1; i++) {
            char c = s.charAt(i);
            char d = s.charAt(i + 1);
            if(c == d) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 1;
            }
        }
        return maxCount;
    }
}