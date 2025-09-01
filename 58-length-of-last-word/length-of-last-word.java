class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int last=s.lastIndexOf(' ');
        int fin=s.length()-last-1;
        return fin;
    }
}