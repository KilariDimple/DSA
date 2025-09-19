class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            if(hm1.containsKey(ch1)){
                int prev=hm1.get(ch1);
                hm1.put(ch1,prev+1);
            }
            else{
                hm1.put(ch1,1);
            }
        }
            for(int i=0;i<t.length();i++){
            char ch1=t.charAt(i);
            if(hm2.containsKey(ch1)){
                int prev=hm2.get(ch1);
                hm2.put(ch1,prev+1);
            }
            else{
                hm2.put(ch1,1);
            }
         }
         if(hm1.equals(hm2)){
            return true;
         }
        return false;
    }
}