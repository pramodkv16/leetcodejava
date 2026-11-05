class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet hs = new HashSet<>();
        for(int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            hs.add(c);
        }
        if(hs.size() == 26) {
            return true;
        }
        return false;
    }
}