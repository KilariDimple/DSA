class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character>hash=new HashMap<>();
        int temp=97;
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            if(ch!=' '&&!hash.containsKey(ch)){
                hash.put(ch,(char)temp);
                temp++;
            }

        }
        String ans="";
            for(int i=0;i<message.length();i++){
                char ch=message.charAt(i);
                if(ch!=' '){
                    ans=ans+hash.get(ch);
                }
                else{
                    ans=ans+' ';
                }
          }
        return ans; 
        }
        
    }
