class Solution {
    public String reverseWords(String s) {
        String res="";
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--){
            
            if (arr[i].length() == 0) {
                continue;   
            }
            res= res+arr[i]+" ";

        }
        String result=res.trim();

        return result;
    }
}