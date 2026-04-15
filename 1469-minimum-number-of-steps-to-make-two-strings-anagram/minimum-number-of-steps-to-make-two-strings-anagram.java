class Solution {
    public int minSteps(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(hm.containsKey(ch)){
                int val=hm.get(ch);
                hm.put(ch,val+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(int i=0;i<t.length();i++){
            char  ch=t.charAt(i);
            if(hm.containsKey(ch)){
                int val=hm.get(ch);
                hm.put(ch, val-1);
            }
            else{
                hm.put(ch,-1);
            }
        }
        int steps=0;
        for(Character key:hm.keySet()){
            int count=hm.get(key);
            if(count>0){
                steps+=count;
            }
        }
    return steps;
    }
}