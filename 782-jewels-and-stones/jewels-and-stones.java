class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer >hash=new HashMap<>();
        int ans=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(hash.containsKey(ch)){

                int prev=hash.get(ch);
                hash.put(ch,prev+1);
            }
            else{
                hash.put(ch,1);
            }
        }
        for(int i=0;i<jewels.length();i++){
            char ch=jewels.charAt(i);
            if(hash.containsKey(ch)){
                ans=ans+hash.get(ch);

            }
        }
        return ans;
    }
}