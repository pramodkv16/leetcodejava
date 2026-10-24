class Solution {
    public char findTheDifference(String s, String t) {
        char total = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            total ^= c;
        }
        for(int j = 0; j < t.length(); j++){
            char c = t.charAt(j);
            total ^= c;
        }
        return total;
    }
}