class Solution {
    public int repeatedStringMatch(String a, String b) {

        String ans = a;
        int fin = 1;

        while(ans.length() <= b.length() + a.length()){

            if(ans.contains(b)){
                return fin;
            }

            ans = ans + a;
            fin++;
        }

        if(ans.contains(b)){
            return fin;
        }

        return -1;
    }
}