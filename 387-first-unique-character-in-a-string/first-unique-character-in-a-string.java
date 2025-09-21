class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                int prev=hm.get(ch);
                hm.put(ch,prev+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.get(ch)==1){
                ans=i;
                return ans;
            }
        }
        return -1;
    }
}